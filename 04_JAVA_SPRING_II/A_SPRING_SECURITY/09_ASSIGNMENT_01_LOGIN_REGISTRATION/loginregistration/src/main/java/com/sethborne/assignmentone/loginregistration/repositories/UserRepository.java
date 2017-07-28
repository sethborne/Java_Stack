package com.sethborne.assignmentone.loginregistration.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sethborne.assignmentone.loginregistration.models.User;

@Repository

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
