package com.sethborne.assignmentone.driverslicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sethborne.assignmentone.driverslicense.models.Person;

@Repository

public interface PersonRepository extends CrudRepository<Person, Long> {
	//find one person
	Person getPersonById(Long search);
	
	//find all no License	
	List<Person> findAllByLicenseNull();
}
