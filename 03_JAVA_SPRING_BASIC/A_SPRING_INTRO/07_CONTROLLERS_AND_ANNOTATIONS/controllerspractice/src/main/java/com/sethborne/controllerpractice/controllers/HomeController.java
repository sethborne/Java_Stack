package com.sethborne.controllerpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "Hello World.  I'm Testing my Controller.";
	}
	
}
