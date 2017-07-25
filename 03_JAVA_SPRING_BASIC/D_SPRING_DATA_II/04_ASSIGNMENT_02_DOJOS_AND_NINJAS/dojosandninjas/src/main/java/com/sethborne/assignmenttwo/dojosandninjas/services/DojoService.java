package com.sethborne.assignmenttwo.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sethborne.assignmenttwo.dojosandninjas.models.Dojo;
import com.sethborne.assignmenttwo.dojosandninjas.repositories.DojoRepository;

@Service

public class DojoService {
	public DojoRepository dojoRepository;
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	public void createDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	
	public List<Dojo> findAll(){
		return (List<Dojo>) dojoRepository.findAll();
	}
	
	public Dojo findDojoById(Long id) {
		return dojoRepository.findOne(id);
	}
}
