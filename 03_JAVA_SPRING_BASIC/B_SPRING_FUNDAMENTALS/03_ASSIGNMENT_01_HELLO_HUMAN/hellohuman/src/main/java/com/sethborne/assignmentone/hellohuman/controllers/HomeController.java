package com.sethborne.assignmentone.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HomeController {
	@RequestMapping("/")
	public String index(Model model, @RequestParam(defaultValue = "Unknown", value="name") String name ) {
		model.addAttribute("name", name);
		return "index.jsp";
	}
	
}


