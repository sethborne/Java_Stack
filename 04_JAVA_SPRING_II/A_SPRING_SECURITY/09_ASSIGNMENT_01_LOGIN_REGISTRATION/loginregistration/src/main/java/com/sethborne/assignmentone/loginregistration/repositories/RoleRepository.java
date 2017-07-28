package com.sethborne.assignmentone.loginregistration.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sethborne.assignmentone.loginregistration.models.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	List<Role> findAll();
	
	List<Role> findByName(String names);
}
