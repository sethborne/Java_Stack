package com.sethborne.assignmenttwo.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sethborne.assignmenttwo.dojosandninjas.models.Ninja;
import com.sethborne.assignmenttwo.dojosandninjas.repositories.NinjaRepository;

@Service

public class NinjaService {
	private NinjaRepository ninjaRepository;
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	public void createNinja(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
	
	public List<Ninja> allNinjas(){
		return (List<Ninja>) ninjaRepository.findAll();
	}
	
	public Ninja findNinjaById(Long id) {
		return ninjaRepository.findOne(id);
	}
}
