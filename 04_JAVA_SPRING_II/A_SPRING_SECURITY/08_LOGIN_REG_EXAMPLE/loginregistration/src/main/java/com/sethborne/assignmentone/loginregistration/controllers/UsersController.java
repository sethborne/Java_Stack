package com.sethborne.assignmentone.loginregistration.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sethborne.assignmentone.loginregistration.models.User;
import com.sethborne.assignmentone.loginregistration.services.UserService;

@Controller

public class UsersController {
	
	private UserService userService;
	public UsersController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/registration")
	public String registerForm(@Valid @ModelAttribute("user") User user) {
		return "registrationPage.jsp";
	}
	
	@PostMapping("/registration")
	public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		if(result.hasErrors()) {
			return "registrationPage.jsp";
		}
		userService.saveUserWithRoleUser(user);
		return "redirect:/login";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "loginPage.jsp";
	}
}
