package com.sethborne.assignmentfive.dojosurvey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class DojosurveyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DojosurveyApplication.class, args);
	}
	
//	@RequestMapping("/")
//	public String index() {
//		return "index.jsp";
//	}
}
