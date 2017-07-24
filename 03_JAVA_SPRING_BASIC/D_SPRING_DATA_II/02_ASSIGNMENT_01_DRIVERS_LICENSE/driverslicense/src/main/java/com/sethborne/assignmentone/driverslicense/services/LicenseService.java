package com.sethborne.assignmentone.driverslicense.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sethborne.assignmentone.driverslicense.models.License;
import com.sethborne.assignmentone.driverslicense.models.State;
import com.sethborne.assignmentone.driverslicense.repositories.LicenseRepository;

@Service

public class LicenseService {
	
	private LicenseRepository licenseRepository;
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	public void addLicense(License license) {
		licenseRepository.save(license);
		// huh?
		License lastLicense = licenseRepository.findOne(license.getId());
		lastLicense.setNumber(String.format("%06d", license.getId()));
		licenseRepository.save(lastLicense);
	}
	
	private List<State> allStates = new ArrayList<>(Arrays.asList(
			new State("Alabama", "AL"),
			new State("Alaska", "AK"),
			new State("Arizona", "AZ"),
			new State("Arkansas", "AR"),
			new State("California", "CA"),
			new State("Colorado", "CO"),
			new State("Connecticut", "CT"),
			new State("Delaware", "DE"),
			new State("Florida", "FL"),
			new State("Georgia", "GA"),
			new State("Hawaii", "HI"),
			new State("Idaho", "ID"),
			new State("Illinois", "IL"),
			new State("Indiana", "IN"),
			new State("Iowa", "IA"),
			new State("Kansas", "KS"),
			new State("Kentucky", "KY"),
			new State("Louisiana", "LA"),
			new State("Maine", "ME"),
			new State("Maryland", "MD"),
			new State("Massachusetts", "MA"),
			new State("Michigan", "MI"),
			new State("Minnesota", "MN"),
			new State("Mississippi", "MS"),
			new State("Missouri", "MO"),
			new State("Montana", "MT"),
			new State("Nebraska", "NE"),
			new State("Nevada", "NV"),
			new State("New Hampshire", "NH"),
			new State("New Jersey", "NJ"),
			new State("New Mexico", "NM"),
			new State("New York", "NY"),
			new State("North Carolina", "NC"),
			new State("North Dakota", "ND"),
			new State("Ohio", "OH"),
			new State("Oklahoma", "OK"),
			new State("Oregon", "OR"),
			new State("Pennsylvania", "PA"),
			new State("Rhode Island", "RI"),
			new State("South Carolina", "SC"),
			new State("South Dakota", "SD"),
			new State("Tennessee", "TN"),
			new State("Texas", "TX"),
			new State("Utah", "UT"),
			new State("Vermont", "VT"),
			new State("Virginia", "VA"),
			new State("Washington", "WA"),
			new State("West Virginia", "WV"),
			new State("Wisconsin", "WI"),
			new State("Wyoming", "WY")
		));
	
	public List<State> getAllStates(){
		return allStates;
	}
	
}
