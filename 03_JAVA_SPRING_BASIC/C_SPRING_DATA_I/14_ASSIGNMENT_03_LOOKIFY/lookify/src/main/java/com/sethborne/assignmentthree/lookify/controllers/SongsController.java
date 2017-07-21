package com.sethborne.assignmentthree.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sethborne.assignmentthree.lookify.models.Song;
import com.sethborne.assignmentthree.lookify.services.SongService;

@Controller

public class SongsController {
	
	//Instantiate SongService
	private SongService songService;
	public SongsController(SongService songService) {
		this.songService = songService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/songs/add")
	public String addSong(@ModelAttribute("song") Song song) {
		return "addSong.jsp";
	}
	
	@PostMapping("/songs/add")
	public String createBook(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "addSong.jsp";
		}
		else {
			System.out.println(song);			
			songService.addSong(song);
			return "redirect:/songs/dashboard";
		}
	}
	
	@RequestMapping("/songs/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = songService.allSongs();
		model.addAttribute("songs", songs);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/songs/{id}")
	public String findSongById(Model model, @PathVariable("id") Long id) {
		Song song = songService.findSongById(id);
		model.addAttribute("song", song);
		return "showSong.jsp";
	}
	
	@RequestMapping("/songs/edit/{id}")
	public String editSong(@PathVariable("id") Long id, Model model) {
		Song song = songService.findSongById(id);
		if(song != null) {
			model.addAttribute("song", song);
			return "editSong.jsp";
		}
		else {
			return "redirect:/songs/dashboard";
		}
	}
	
	@PostMapping("/songs/edit/{id}")
	public String updateSong(@Valid @ModelAttribute("song") Song song, BindingResult result, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			return "editSong.jsp";
		}
		else {
			songService.updateSong(song);
			return "redirect:/songs/dashboard";
		}
	}

}
