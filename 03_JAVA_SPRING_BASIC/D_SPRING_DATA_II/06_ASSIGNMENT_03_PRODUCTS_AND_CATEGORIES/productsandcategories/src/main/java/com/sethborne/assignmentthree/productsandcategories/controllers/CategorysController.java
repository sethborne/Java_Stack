package com.sethborne.assignmentthree.productsandcategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sethborne.assignmentthree.productsandcategories.models.Category;
import com.sethborne.assignmentthree.productsandcategories.services.CategoryService;

@Controller

public class CategorysController {
	
	//COLOR CLASSES
		public static final String RESET_ALL = "\u001B[0m";
		public static final String RED_BKGRD = "\u001B[41m";
		public static final String GREEN_BKGRD = "\u001B[42m";
		public static final String CYAN_BKGRD = "\u001B[46m";
		public static final String BLUE_BKGRD = "\u001B[44m";
		public static final String PURPLE_BKGRD = "\u001B[45m";
		public static final String WHITE_TXT = "\u001B[37m";
		
	private CategoryService categoryService;
	public CategorysController(CategoryService categoryService){
		this.categoryService = categoryService;
	}
	
	@RequestMapping("/categorys/add")
	public String addCategory(@ModelAttribute("category") Category category) {
		return "addCategory.jsp";
	}
	
	@PostMapping("/categorys/create")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "addCategory.jsp";
		}
		else {
			Boolean createObjCheck = false;
			if(category != null) {
				createObjCheck = true;
				System.out.println("The Form Successfully Posted");
			}
			else {
				System.out.println("The Form Did NOT POST");
			}
			if(createObjCheck = true) {
				String nameCheck = category.getName();
				System.out.println("Post Successful.  Information Posted:  Name: " + nameCheck);
			
				categoryService.createCategory(category);
				
				return "redirect:/";
			}
			else {
				return "addCategory.jsp";
			}
		}
	}

	@RequestMapping("/categorys/all")
	public String allCategorys (Model model) {
		List<Category> allCategorys = categoryService.allCategorys();
		model.addAttribute("allCategorys", allCategorys);
		return "showAllCategorys.jsp";
	}
}
