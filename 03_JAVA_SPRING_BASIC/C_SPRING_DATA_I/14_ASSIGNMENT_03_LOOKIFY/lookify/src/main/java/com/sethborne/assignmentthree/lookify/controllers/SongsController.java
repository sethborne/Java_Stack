package com.sethborne.assignmentthree.lookify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SongsController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

}
