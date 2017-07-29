package com.sethborne.assignmenttwo.admindashboard.controllers;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sethborne.assignmenttwo.admindashboard.models.Role;
import com.sethborne.assignmenttwo.admindashboard.models.TextColor;
import com.sethborne.assignmenttwo.admindashboard.models.User;
import com.sethborne.assignmenttwo.admindashboard.repositories.RoleRepository;
import com.sethborne.assignmenttwo.admindashboard.services.UserService;
import com.sethborne.assignmenttwo.admindashboard.validator.UserValidator;

@Controller

public class UsersController {
	private UserService userService;
	private UserValidator userValidator;
	private RoleRepository roleRepository;
	public UsersController(UserService userService, UserValidator userValidator, RoleRepository roleRepository) {
		this.userService = userService;
		this.userValidator = userValidator;
		this.roleRepository = roleRepository;
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
		
		
//		userService.saveUserWithRoleUser(user);
		userService.saveUserWithRoleAdmin(user);
		
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
		
		User currentUser = userService.findByUsername(username);
		model.addAttribute("currentUser", currentUser);
		
		Role adminRole = userService.findRoleByName("ROLE_ADMIN");
		model.addAttribute("adminRole", adminRole);

		String timestampMostRecentLogin = userService.timeOfLastSignIn();
//		System.out.println(userService.timeOfLastSignIn());
		model.addAttribute("timestampMostRecentLogin", timestampMostRecentLogin);
		
		return "dashboard.jsp";
	}
	
	@RequestMapping("/admin")
	public String adminPage(Principal principal, Model model) {
		// user for "session"
		String username = principal.getName();
		
		// list of all users
		List<User> allUsers = userService.getAllUsers();
		
		// is admin role?
		Role adminRole = userService.findRoleByName("ROLE_ADMIN");
//		System.out.println(adminRole);
		
		model.addAttribute("allUsers", allUsers);
		model.addAttribute("adminRole", adminRole);
		model.addAttribute("currentUser", userService.findByUsername(username));
		return "adminPage.jsp";
	}
	
	@PostMapping("/users/makeadmin/{id}")
    public String makeUserAdmin(@PathVariable("id") Long id){
        User user = userService.getUserById(id);
        userService.makeUserAdmin(user);
        return "redirect:/admin";
    }
}
