package com.sethborne.assignmenttwo.admindashboard.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sethborne.assignmenttwo.admindashboard.models.Role;
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
		
		List<Role> testPrint = roleRepository.findByName("ROLE_ADMIN");
		System.out.println(testPrint);
		
		user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
		
		userRepository.save(user);
	}
	
	public List<User> getAllUsers(){
		List<User> allUsers = (List<User>) userRepository.findAll();
		return allUsers;
	}
	
	public User getUserById(Long id){
        return userRepository.findOne(id);
    }
	
	public Boolean isAdmin() {
		Role role = roleRepository.findByName("ROLE_ADMIN").get(0);
		System.out.println(role.getName());
		if(userRepository.findByRolesContains(role).size()>0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void makeUserAdmin(User user) {
		user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
//		int setRoleNumVal = roleRepository.findByName("ROLE_ADMIN");
		userRepository.save(user);
	}
	
	public void deleteUser(Long id) {
		userRepository.delete(id);
	}
	
	public Role findRoleByName(String name) {
		return roleRepository.findByName(name).get(0);
	}
	
	public int findByRolesContains(Role role){
		int roleSize = userRepository.findByRolesContains(role).size();
		return roleSize;
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
