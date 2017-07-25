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
import com.sethborne.assignmenttwo.dojosandninjas.services.DojoService;
import com.sethborne.assignmenttwo.dojosandninjas.services.NinjaService;

@Controller

public class DojosController {
	private DojoService dojoService;
	private NinjaService ninjaService;
	public DojosController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/dojos/add")
	public String addDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "addDojo.jsp";
	}
	
	@PostMapping("/dojos/create")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "addDojo.jsp";
		}
		else {
			dojoService.createDojo(dojo);
			System.out.println(dojo);
			return "redirect:/";			
		}
	}
	
	@RequestMapping("/dojos/all")
	public String allDojos(Model model) {
		List<Dojo> allDojos = dojoService.findAll();
		model.addAttribute("allDojos", allDojos);
		return "showAllDojos.jsp";
	}
	
	@RequestMapping("/dojos/{id}")
	public String findDojoById(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoService.findDojoById(id);
		int numNinjasPerDojo = dojo.getNinjas().size();
//		System.out.println(dojo.getNinjas().size());
		model.addAttribute("dojo", dojo);
		model.addAttribute("numNinjasPerDojo", numNinjasPerDojo);
		return "showOneDojo.jsp";
	}
}
