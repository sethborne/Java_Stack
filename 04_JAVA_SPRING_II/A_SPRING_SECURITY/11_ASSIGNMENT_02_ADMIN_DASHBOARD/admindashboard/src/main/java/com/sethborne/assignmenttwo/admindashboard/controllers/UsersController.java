package com.sethborne.assignmenttwo.admindashboard.controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sethborne.assignmenttwo.admindashboard.models.TextColor;
import com.sethborne.assignmenttwo.admindashboard.models.User;
import com.sethborne.assignmenttwo.admindashboard.services.UserService;
import com.sethborne.assignmenttwo.admindashboard.validator.UserValidator;

@Controller

public class UsersController {
	private UserService userService;
	private UserValidator userValidator;
	public UsersController(UserService userService, UserValidator userValidator) {
		this.userService = userService;
		this.userValidator = userValidator;
	}
	
	@RequestMapping("/registration")
	public String registerForm(@Valid @ModelAttribute("user") User user) {
		return "index.jsp";
	}
	
	@PostMapping("/registration")
	public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model, HttpSession session) {

		userValidator.validate(user, result);
//		System.out.println(result.errors);
		
		if(result.hasErrors()) {
//			for(ObjectError error: result.getAllErrors() ) {
//				System.out.println(error.getCodes());
//				for(Object e : error.getCodes()) {
//					System.out.println(e);
//				}
//			}
			return "index.jsp";
		}
		
		String usernameCheck = user.getUsername();
		String firstNameCheck = user.getFirstName();
		String lastNameCheck = user.getLastName();
		String passwordCheck = user.getPassword();
		System.out.println(TextColor.getColor("GREEN_BKGRD") + TextColor.getColor("WHITE_TXT") + "@Controller: Sending to Service: Username: " + usernameCheck + " First Name: " + firstNameCheck + " Last Name: " + lastNameCheck + " Password: " + passwordCheck + TextColor.getColor("RESET_ALL"));

		userService.saveUserWithRoleUser(user);
		
		return "redirect:/login";
	}
	
	@RequestMapping("/login")
	public String login(@ModelAttribute("user") User user, @RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, BindingResult result, Model model, HttpSession session) {
		if(error != null) {
			model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
		}
		if(logout != null) {
			model.addAttribute("logoutMessage", "Logout Successful!");
		}
		return "index.jsp";
	}
	
	@RequestMapping(value= {"/", "/dashboard"})
	public String dashboard(Principal principal, Model model) {
		String username = principal.getName();
		
		model.addAttribute("currentUser", userService.findByUsername(username));
		
//		System.out.println(userService.timeOfLastSignIn());
		String timestampMostRecentLogin = userService.timeOfLastSignIn();
		model.addAttribute("timestampMostRecentLogin", timestampMostRecentLogin);
		
		return "dashboard.jsp";
	}
}
