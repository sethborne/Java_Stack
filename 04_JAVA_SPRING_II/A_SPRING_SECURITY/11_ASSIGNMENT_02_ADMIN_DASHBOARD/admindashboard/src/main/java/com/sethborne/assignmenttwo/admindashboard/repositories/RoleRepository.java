package com.sethborne.assignmenttwo.admindashboard.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sethborne.assignmenttwo.admindashboard.models.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	List<Role> findAll();
	
	List<Role> findByName(String names);
}
