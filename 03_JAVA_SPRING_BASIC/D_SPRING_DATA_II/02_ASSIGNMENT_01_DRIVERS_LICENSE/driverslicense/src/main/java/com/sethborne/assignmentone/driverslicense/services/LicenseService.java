package com.sethborne.assignmentone.driverslicense.services;

import org.springframework.stereotype.Service;

import com.sethborne.assignmentone.driverslicense.models.License;
import com.sethborne.assignmentone.driverslicense.repositories.LicenseRepository;

@Service

public class LicenseService {
	
	private LicenseRepository licenseRepository;
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	public void addLicense(License license) {
		licenseRepository.save(license);
	}

}
