package com.sethborne.assignmenttwo.admindashboard.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sethborne.assignmenttwo.admindashboard.models.User;

@Repository

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
