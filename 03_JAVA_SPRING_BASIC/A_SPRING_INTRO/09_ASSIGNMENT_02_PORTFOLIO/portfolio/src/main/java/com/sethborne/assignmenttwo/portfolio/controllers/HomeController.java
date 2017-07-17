package com.sethborne.assignmenttwo.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping("/projects")
	public String projects() {
		return "projectsPage.html";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "aboutPage.html";
	}
	
}
