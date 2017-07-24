package com.sethborne.assignmentone.driverslicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sethborne.assignmentone.driverslicense.models.Person;
import com.sethborne.assignmentone.driverslicense.services.PersonService;

@Controller

public class PersonsController {
	
	private PersonService personService;
	public PersonsController(PersonService personService) {
		this.personService = personService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/persons/add")
	public String addPerson(@ModelAttribute Person person) {
		return "addPerson.jsp";
	}
	
	@PostMapping("/persons/add")
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "addPerson.jsp";
		}
		System.out.println(person);
		personService.addPerson(person);
		return "redirect:/persons/add";
	}
	
	@RequestMapping("/persons")
	public String persons (Model model) {
		List<Person> persons = personService.allPersons();
		model.addAttribute("persons", persons);
		return "showAllPersons.jsp";
	}
	
	@RequestMapping("/persons/{id}")
	public String getPersonById(Model model, @PathVariable("id") Long id) {
		Person person = personService.getPersonById(id);
		if(person == null) {
			return "redirect:/";
		}
		else {
			model.addAttribute("person", person);
			return "showPerson.jsp";			
		}
	}
	
}