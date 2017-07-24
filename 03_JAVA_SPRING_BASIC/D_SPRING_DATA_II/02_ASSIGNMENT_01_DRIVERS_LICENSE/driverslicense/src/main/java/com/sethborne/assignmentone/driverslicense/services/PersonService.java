package com.sethborne.assignmentone.driverslicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sethborne.assignmentone.driverslicense.models.Person;
import com.sethborne.assignmentone.driverslicense.repositories.PersonRepository;

@Service

public class PersonService {
	
	private PersonRepository personRepository;
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public void addPerson(Person person) {
		personRepository.save(person);
	}
	
	public List<Person> allPersons(){
		return (List<Person>) personRepository.findAll();
	}

	public Person getPersonById(Long id) {
//		return personRepository.findOne(id);
		Person person = personRepository.getPersonById(id);
		return person;
	}
	
	//people without licenses
	public List<Person> getPersonsWithoutLicense(){
		List<Person> peopleWithNoLicense = personRepository.findAllByLicenseNull();
		return peopleWithNoLicense;
	}
}
