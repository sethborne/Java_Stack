package com.sethborne.assignmentthree.productsandcategories.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sethborne.assignmentthree.productsandcategories.models.Product;

@Controller

public class ProductsController {
	
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/products/add")
	public String addProduct(Product product) {
		return "addProduct.jsp";
	}
	
	@PostMapping("/products/create")
	public String createProduct(Product product) {
		return "redirect:/";
	}
}
