package com.sethborne.assignmentone.driverslicense.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sethborne.assignmentone.driverslicense.models.License;
import com.sethborne.assignmentone.driverslicense.services.LicenseService;

@Controller

public class LicensesController {
	
	private LicenseService licenseService;
	public LicensesController(LicenseService licenseService) {
		this.licenseService = licenseService;
	}
	
	@RequestMapping("/licenses/add")
	public String addLicense(@ModelAttribute("license") License license) {
		return "addLicense.jsp";
	}
	
}
