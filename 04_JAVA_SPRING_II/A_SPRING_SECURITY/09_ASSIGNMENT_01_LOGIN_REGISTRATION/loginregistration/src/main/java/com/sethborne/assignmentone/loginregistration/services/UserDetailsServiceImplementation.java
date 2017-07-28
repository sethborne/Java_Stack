package com.sethborne.assignmentone.loginregistration.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sethborne.assignmentone.loginregistration.models.Role;
import com.sethborne.assignmentone.loginregistration.models.User;
import com.sethborne.assignmentone.loginregistration.repositories.UserRepository;

@Service

public class UserDetailsServiceImplementation implements UserDetailsService{
	private UserRepository userRepository;
	public UserDetailsServiceImplementation(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		User user = userRepository.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("User Not Found");
		}
		Date newUpdatedAt = new Date();
		user.setUpdatedAt(newUpdatedAt);
		userRepository.save(user);
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthorities(user));
	}
	
	//function for last call in loadUserByUsername
	private List<GrantedAuthority> getAuthorities(User user){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for(Role role : user.getRoles()) {
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getName());
			authorities.add(grantedAuthority);
		}
		return authorities;
	}
}
