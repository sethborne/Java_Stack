package com.sethborne.assignmenttwo.languages.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sethborne.assignmenttwo.languages.models.Language;
import com.sethborne.assignmenttwo.languages.services.LanguageService;

@Controller

public class LanguagesController {
	
	private LanguageService languageService;
	public LanguagesController(LanguageService  languageService) {
		this.languageService = languageService;
	}

	@RequestMapping("/languages")
	public String languages (Model model) {
		List<Language> languages = languageService.allLanguages();
		System.out.println(languages);
		model.addAttribute("languages", languages);
		return "languages.jsp";
	}
	
	@RequestMapping("/languages/{id}")
	public String findLanguageById(Model model, @PathVariable("id") Long id) {
		Language language = languageService.findLanguageById(id);
		model.addAttribute("language", language);
		return "showLanguage.jsp";
	}
	
	@RequestMapping("/languages/add")
	public String addLanguage(@ModelAttribute("language") Language language) {
		return "addLanguage.jsp";
	}
	
	@PostMapping("/languages/add")
	public String createBook(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "addLanguage.jsp";
		}
		else {
			languageService.addLanguage(language);
			System.out.println(language);
			return "redirect:/languages";			
		}
	}
	
	@RequestMapping("/languages/edit/{id}")
	public String editLanguage(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguageById(id);
		if(language != null) {
			model.addAttribute("language", language);
			return "editLanguage.jsp";
		}
		else {
			return "redirect:/languages";
		}
	}
	
	@PostMapping("/languages/edit/{id}")
	public String updateLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			return "editLanguages.jsp";
		}
		else {
			languageService.updateLanguage(language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/delete/{id}")
	public String destroyLanguage(@PathVariable("id") Long id) {
		languageService.destroyLanguage(id);
		return "redirect:/languages";
	}
}
