package com.sethborne.lessonten.springboottemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SpringboottemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboottemplateApplication.class, args);
	}
	
	@Controller
	public class HomeController {
	    @RequestMapping("/")
	    public String index() {
	        return "index.jsp";
	    }
	}
}
