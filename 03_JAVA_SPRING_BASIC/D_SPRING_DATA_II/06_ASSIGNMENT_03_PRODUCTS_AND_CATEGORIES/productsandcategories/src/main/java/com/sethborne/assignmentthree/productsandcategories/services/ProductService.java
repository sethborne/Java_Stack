package com.sethborne.assignmentthree.productsandcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sethborne.assignmentthree.productsandcategories.models.Category;
import com.sethborne.assignmentthree.productsandcategories.models.Product;
import com.sethborne.assignmentthree.productsandcategories.repositories.CategoryRepository;
import com.sethborne.assignmentthree.productsandcategories.repositories.ProductRepository;

@Service

public class ProductService {
	
	//COLOR CLASSES
		public static final String RESET_ALL = "\u001B[0m";
		public static final String RED_BKGRD = "\u001B[41m";
		public static final String GREEN_BKGRD = "\u001B[42m";
		public static final String CYAN_BKGRD = "\u001B[46m";
		public static final String BLUE_BKGRD = "\u001B[44m";
		public static final String PURPLE_BKGRD = "\u001B[45m";
		public static final String WHITE_TXT = "\u001B[37m";
	
	private ProductRepository productRepository;
	private CategoryRepository categoryRepository;
	public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
	}
	
	public void createProduct(Product product) {
		productRepository.save(product);
	}
	
	public List<Product> allProducts(){
		return (List<Product>) productRepository.findAll();
	}
	
	public Product getProductById(Long id) {
		// Check Object Coming Back - Controller
		System.out.println(CYAN_BKGRD + WHITE_TXT + " @Service - Sending to Repository " + id + RESET_ALL);
		Product oneProductAtService = productRepository.findOne(id);
		String nameCheck = oneProductAtService.getName();
		String descriptionCheck = oneProductAtService.getDescription();
		float priceCheck = oneProductAtService.getPrice();
		System.out.println(CYAN_BKGRD + WHITE_TXT + " @Service - Retrieved From Repository Successful:  Information Forwarded:  Name: " + nameCheck + " Description: " + descriptionCheck + " Price: " + priceCheck + RESET_ALL);
		return productRepository.findOne(id);
	}
	
	public void addCategoryToProduct(Long productId, Category category) {
		//product to add too
		Product serVarProductId = getProductById(productId);
		//
		List<Category> productCategorys = serVarProductId.getCategorys();
		productCategorys.add(category);
		// update product
		createProduct(serVarProductId);
	}
	
//	public List<Product> findByCategorysNotContains(Category notProductCategory){
//		List<Product> productHasNotCats = productRepository.findByCategorysNotContains(notProductCategory);
//		System.out.println(productHasNotCats.size());
//		return productHasNotCats;
//	}
	
}
