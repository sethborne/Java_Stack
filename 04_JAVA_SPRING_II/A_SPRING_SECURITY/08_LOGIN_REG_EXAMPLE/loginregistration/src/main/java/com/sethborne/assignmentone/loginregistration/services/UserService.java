package com.sethborne.assignmentone.loginregistration.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

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
