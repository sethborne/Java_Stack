package com.sethborne.assignmentone.loginregistration.controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sethborne.assignmentone.loginregistration.models.TextColor;
import com.sethborne.assignmentone.loginregistration.models.User;
import com.sethborne.assignmentone.loginregistration.services.UserService;
import com.sethborne.assignmentone.loginregistration.validator.UserValidator;

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
		return "registrationPage.jsp";
	}
	
	@PostMapping("/registration")
	public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model, HttpSession session) {
		
		String passwordCheck1 = user.getPassword();
		String passwordConfirmationCheck1 = user.getPasswordConfirmation();
		
		System.out.println(TextColor.getColor("GREEN_BKGRD") + TextColor.getColor("WHITE_TXT") + "@Controller: Sending to Service: Password: " + passwordCheck1 + " PasswordConfirm: " + passwordConfirmationCheck1 + TextColor.getColor("RESET_ALL"));
		
		userValidator.validate(user, result);
//		System.out.println(result.errors);
		
		
		
		if(result.hasErrors()) {
//			for(ObjectError error: result.getAllErrors() ) {
//				System.out.println(error.getCodes());
//				for(Object e : error.getCodes()) {
//					System.out.println(e);
//				}
//			}
			return "registrationPage.jsp";
		}
		
		String usernameCheck = user.getUsername();
		String passwordCheck = user.getPassword();
		System.out.println(TextColor.getColor("GREEN_BKGRD") + TextColor.getColor("WHITE_TXT") + "@Controller: Sending to Service: Username: " + usernameCheck + " Password: " + passwordCheck + TextColor.getColor("RESET_ALL"));

		userService.saveUserWithRoleUser(user);
		
		return "redirect:/login";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
		if(error != null) {
			model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
		}
		if(logout != null) {
			model.addAttribute("logoutMessage", "Logout Successful!");
		}
		return "loginPage.jsp";
	}
	
	@RequestMapping(value= {"/", "/dashboard"})
	public String dashboard(Principal principal, Model model) {
		String username = principal.getName();
		model.addAttribute("currentUser", userService.findByUsername(username));
		return "dashboard.jsp";
	}
}
