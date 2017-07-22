package com.sethborne.assignmentone.driverslicense.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sethborne.assignmentone.driverslicense.models.Person;

@Repository

public interface PersonRepository extends CrudRepository<Person, Long> {

}
