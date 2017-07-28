package com.sethborne.assignmentone.loginregistration.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sethborne.assignmentone.loginregistration.models.TextColor;
import com.sethborne.assignmentone.loginregistration.models.User;
import com.sethborne.assignmentone.loginregistration.repositories.RoleRepository;
import com.sethborne.assignmentone.loginregistration.repositories.UserRepository;

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
		String passwordCheck = user.getPassword();
		System.out.println(TextColor.getColor("CYAN_BKGRD") + TextColor.getColor("WHITE_TXT") + "@Service: Sending to Repository: Username: " + usernameCheck + " Password: " + passwordCheck + TextColor.getColor("RESET_ALL"));
		
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

}
