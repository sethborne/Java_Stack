package com.sethborne.assignmentthree.productsandcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sethborne.assignmentthree.productsandcategories.models.Category;
import com.sethborne.assignmentthree.productsandcategories.models.Product;
import com.sethborne.assignmentthree.productsandcategories.models.TextColor;
import com.sethborne.assignmentthree.productsandcategories.repositories.CategoryRepository;
import com.sethborne.assignmentthree.productsandcategories.repositories.ProductRepository;

@Service

public class ProductService {
	
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
		System.out.println(TextColor.getColor("CYAN_BKGRD") + TextColor.getColor("WHITE_TXT") + " @Service - Sending to Repository " + id + TextColor.getColor("RESET_ALL"));
		Product oneProductAtService = productRepository.findOne(id);
		String nameCheck = oneProductAtService.getName();
		String descriptionCheck = oneProductAtService.getDescription();
		float priceCheck = oneProductAtService.getPrice();
		System.out.println(TextColor.getColor("CYAN_BKGRD") + TextColor.getColor("WHITE_TXT") + " @Service - Retrieved From Repository Successful:  Information Forwarded:  Name: " + nameCheck + " Description: " + descriptionCheck + " Price: " + priceCheck + TextColor.getColor("RESET_ALL"));
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
