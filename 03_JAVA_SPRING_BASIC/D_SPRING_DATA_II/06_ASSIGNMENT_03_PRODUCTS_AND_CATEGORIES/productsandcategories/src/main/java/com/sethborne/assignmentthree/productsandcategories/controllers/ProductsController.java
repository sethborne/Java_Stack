package com.sethborne.assignmentthree.productsandcategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sethborne.assignmentthree.productsandcategories.models.Category;
import com.sethborne.assignmentthree.productsandcategories.models.Product;
import com.sethborne.assignmentthree.productsandcategories.models.TextColor;
import com.sethborne.assignmentthree.productsandcategories.services.CategoryService;
import com.sethborne.assignmentthree.productsandcategories.services.ProductService;

@Controller

public class ProductsController {
	
	//COLOR CLASSES
	public static final String RESET_ALL = "\u001B[0m";
	public static final String RED_BKGRD = "\u001B[41m";
	public static final String GREEN_BKGRD = "\u001B[42m";
	public static final String CYAN_BKGRD = "\u001B[46m";
	public static final String BLUE_BKGRD = "\u001B[44m";
	public static final String PURPLE_BKGRD = "\u001B[45m";
	public static final String WHITE_TXT = "\u001B[37m";
	
	private ProductService productService;
	private CategoryService categoryService;
	public ProductsController(ProductService productService, CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/products/add")
	public String addProduct(@ModelAttribute("product") Product product) {
		return "addProduct.jsp";
	}
	
	@PostMapping("/products/create")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {

		if(result.hasErrors()) {
			return "addProduct.jsp";
		}
		else {
			//WHAT THE FUCK?
			Boolean createObjCheck;
			if(product != null) {
				createObjCheck = true;
				System.out.println("The Form Successfully Posted");
			}
			else {
				createObjCheck = false;
				System.out.println("The Form Did NOT POST");
			}
			if(createObjCheck = true) {
				String nameCheck = product.getName();
				String descriptionCheck = product.getDescription();
				float priceCheck = product.getPrice();
				System.out.println(GREEN_BKGRD + WHITE_TXT + " Post Successful.  Information Posted:  Name: " + nameCheck + " Description: " + descriptionCheck + " Price: " + priceCheck + RESET_ALL);
				
				productService.createProduct(product);
				
				return "redirect:/";
			}
			else {
				return "addProduct.jsp";
			}
		}
	}
	
	@RequestMapping("/products/all")
	public String allProducts (Model model) {
		List<Product> allProducts = productService.allProducts();
		model.addAttribute("allProducts", allProducts);
		return "showAllProducts.jsp";
	}
	
	@RequestMapping("/products/{id}")
	public String findProductById(Model model, @PathVariable("id") Long id) {
		System.out.println(GREEN_BKGRD + WHITE_TXT + " @Controller - Sending to Service:  Id: " + id + RESET_ALL);
		Product showOneProduct = productService.getProductById(id);
		
		// Check Object Coming Back - Controller
		String nameCheck = showOneProduct.getName();
		String descriptionCheck = showOneProduct.getDescription();
		float priceCheck = showOneProduct.getPrice();
		System.out.println(GREEN_BKGRD + WHITE_TXT + " @Controller - Retrieved From Service Successful:  Information Forwarded:  Name: " + nameCheck + " Description: " + descriptionCheck + " Price: " + priceCheck + RESET_ALL);
		
		model.addAttribute("showOneProduct", showOneProduct);
		
		List<Category> allCategoriesNotAdded = categoryService.findProductsNotContains(showOneProduct);
		model.addAttribute("allCategoriesNotAdded", allCategoriesNotAdded);
		
		return "showOneProduct.jsp";
	}
	
	// Add Category to Product
	@PostMapping("/products/addCategoryToProduct/{showOneProductId}")
	public String addCategoryToProduct(Model model, @PathVariable("showOneProductId") Long showOneProductId, @RequestParam(value="categoryId") Long categoryId) {
		//find the categoryId
		Category categoryIdReturn = categoryService.getCategoryById(categoryId);
//		System.out.println(categoryId);
		//use product service for adding category to the product
		// check if default selected
		if(categoryId > 0) {
			productService.addCategoryToProduct(showOneProductId, categoryIdReturn);
			return "redirect:/products/"+showOneProductId;
		}
		else {
			System.out.println(RED_BKGRD + WHITE_TXT + " ERROR:  @Controller - Default DropDown Selected.  Can not add Category to Product.class  Redirecting. " + RESET_ALL);
			return "redirect:/products/{showOneProductId}";
		}
	}
	
	
	
}
