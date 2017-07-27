package com.sethborne.assignmentone.loginregistration.repositories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sethborne.assignmentone.loginregistration.models.User;
import com.sethborne.assignmentone.loginregistration.models.TextColor;

@Repository

public interface UserRepository extends CrudRepository<User, Long> {
//	static void printQuery(User queryUser) {System.out.println(TextColor.getColor("PURPLE_BKGRD") + TextColor.getColor("WHITE_TXT") + " " + queryUser + " " + TextColor.getColor("RESET_ALL"));}
	User findByUsername(String username);
//	System.out.println(TextColor.getColor("PURPLE_BKGRD") + TextColor.getColor("WHITE_TXT") + "Text Here" + TextColor.getColor("RESET_ALL"));
//	void printQuery(findByUsername);
}
