package com.sethborne.assignmentone.grouplanguages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sethborne.assignmentone.grouplanguages.models.Language;
import com.sethborne.assignmentone.grouplanguages.services.LanguageService;

@Controller

public class LanguagesController {
	
	public final LanguageService languageService;
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	//show all languages
	@RequestMapping("/languages")
	public String languages(Model model, @ModelAttribute("language") Language language) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		return "languages.jsp";
	}
	
	//show one language
	@RequestMapping("/languages/{index}")
	public String findLanguageByIndex(Model model, @PathVariable("index") int index) {
		Language language = languageService.findLanguageByIndex(index);
		model.addAttribute("language", language);
		return "showLanguage.jsp";
	}
	
	@PostMapping("/languages/add")
	public String addLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
			return "languages.jsp";
		}
		else {
			languageService.addLanguage(language);
			return "redirect:/languages";			
		}
	}
	
	@RequestMapping("/languages/edit/{id}")
	public String editLanguage(@PathVariable("id") int id, Model model) {
		Language language = languageService.findLanguageByIndex(id);
		if (language != null) {
			model.addAttribute("language", language); 
			return "editLanguage.jsp";
		}
		else {
			return "redirect:/languages";
		}
	}
	
	@PostMapping("/languages/edit/{id}")
	public String updateLanguage(@PathVariable("id") int id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
			return "editLanguage.jsp";
		}
		else {
			languageService.updateLanguage(id, language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping(value="/languages/delete/{id}")
	public String deleteLanguage(@PathVariable("id") int id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}
}
