package com.sethborne.assignmentfive.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultController {
	@RequestMapping("/results")
	public String dashboard() {
		return "results.jsp";
	}
}
