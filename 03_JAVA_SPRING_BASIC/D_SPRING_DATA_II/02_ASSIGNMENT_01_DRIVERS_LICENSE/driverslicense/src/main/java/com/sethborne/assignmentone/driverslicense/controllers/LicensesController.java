package com.sethborne.assignmentone.driverslicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sethborne.assignmentone.driverslicense.models.License;
import com.sethborne.assignmentone.driverslicense.models.Person;
import com.sethborne.assignmentone.driverslicense.models.State;
import com.sethborne.assignmentone.driverslicense.services.LicenseService;
import com.sethborne.assignmentone.driverslicense.services.PersonService;

@Controller

public class LicensesController {
	
	private LicenseService licenseService;
	private PersonService personService;
	
	public LicensesController(LicenseService licenseService, PersonService personService) {
		this.licenseService = licenseService;
		this.personService = personService;
	}
	
//	@RequestMapping("/")
//	public String index() {
//		return "index.jsp";
//	}
	
	// license form Page
	@RequestMapping("/licenses/add")
	public String addLicense(@ModelAttribute("license") License license, Model model) {
		List<Person> personsWithoutLicense = personService.getPersonsWithoutLicense();
		System.out.println("People with No Licenses" + personsWithoutLicense);
		model.addAttribute("personsWithoutLicense", personsWithoutLicense);
		List<State> allStates = licenseService.getAllStates();
		System.out.println("All States" + allStates);
//		for(final State temp : allStates) {
//			System.out.println(temp.getName());
//		}
		model.addAttribute("allStates", allStates);
		return "addLicense.jsp";
	}
	//Make a license
	@PostMapping("/licenses/create")
	public String createLicense(@Valid @ModelAttribute("license") License license, Model model, BindingResult result) {
		if(result.hasErrors()) {
			return "addlicense.jsp";
		} else {
			licenseService.addLicense(license);
			return "redirect:/";
		}
	}
	
}
