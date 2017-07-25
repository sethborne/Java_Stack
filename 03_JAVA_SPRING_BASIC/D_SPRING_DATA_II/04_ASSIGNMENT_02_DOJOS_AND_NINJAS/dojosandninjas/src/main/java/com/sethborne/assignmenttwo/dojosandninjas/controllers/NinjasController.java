package com.sethborne.assignmenttwo.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sethborne.assignmenttwo.dojosandninjas.models.Dojo;
import com.sethborne.assignmenttwo.dojosandninjas.models.Ninja;
import com.sethborne.assignmenttwo.dojosandninjas.services.DojoService;
import com.sethborne.assignmenttwo.dojosandninjas.services.NinjaService;

@Controller

public class NinjasController {
	private NinjaService ninjaService;
	private DojoService dojoService;
	public NinjasController(NinjaService ninjaService, DojoService dojoService) {
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}
	
	@RequestMapping("/ninjas/add")
	public String addNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> allDojos = dojoService.findAll();
		model.addAttribute("allDojos", allDojos);
		return "addNinja.jsp";
	}
	
	@PostMapping("/ninjas/create")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "addNinja.jsp";
		}
		else {
			ninjaService.createNinja(ninja);
			System.out.println(ninja);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/ninjas/all")
	public String allNinjas(Model model) {
		List<Ninja> allNinjas = ninjaService.allNinjas();
		model.addAttribute("allNinjas",allNinjas);
		return "showAllNinjas.jsp";
	}
	
	@RequestMapping("/ninjas/{id}")
	public String findNinjaById(@PathVariable("id") Long id, Model model) {
		Ninja ninja = ninjaService.findNinjaById(id);
		model.addAttribute("ninja", ninja);
		return "showOneNinja.jsp";
	}
}
