package com.sethborne.assignmenttwo.admindashboard.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sethborne.assignmenttwo.admindashboard.models.TextColor;
import com.sethborne.assignmenttwo.admindashboard.models.User;
import com.sethborne.assignmenttwo.admindashboard.repositories.RoleRepository;
import com.sethborne.assignmenttwo.admindashboard.repositories.UserRepository;

@Service

public class UserService {
	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public UserService(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	public void saveUserWithRoleUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(roleRepository.findByName("ROLE_USER"));
		
		String usernameCheck = user.getUsername();
		String firstNameCheck = user.getFirstName();
		String lastNameCheck = user.getLastName();
		String passwordCheck = user.getPassword();
		System.out.println(TextColor.getColor("CYAN_BKGRD") + TextColor.getColor("WHITE_TXT") + "@Service: Sending to Repository: Username: " + usernameCheck + " First Name: " + firstNameCheck + " Last Name: " + lastNameCheck + " Password: " + passwordCheck + TextColor.getColor("RESET_ALL"));
		
		userRepository.save(user);
	}
	
	public void saveUserWithRoleAdmin(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
		userRepository.save(user);
	}
	
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	public String timeOfLastSignIn() {
		DateFormat customFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.0");
		Date lastLogin = Calendar.getInstance().getTime();        
		String timeOfLastSignIn = customFormat.format(lastLogin);
		return timeOfLastSignIn;
	}
}
