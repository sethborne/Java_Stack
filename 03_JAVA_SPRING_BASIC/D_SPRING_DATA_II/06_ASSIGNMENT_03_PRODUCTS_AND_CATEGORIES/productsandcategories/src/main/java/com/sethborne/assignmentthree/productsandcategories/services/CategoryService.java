package com.sethborne.assignmentthree.productsandcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sethborne.assignmentthree.productsandcategories.models.Category;
import com.sethborne.assignmentthree.productsandcategories.models.Product;
import com.sethborne.assignmentthree.productsandcategories.repositories.CategoryRepository;

@Service

public class CategoryService {
	
	//COLOR CLASSES
		public static final String RESET_ALL = "\u001B[0m";
		public static final String RED_BKGRD = "\u001B[41m";
		public static final String GREEN_BKGRD = "\u001B[42m";
		public static final String CYAN_BKGRD = "\u001B[46m";
		public static final String BLUE_BKGRD = "\u001B[44m";
		public static final String PURPLE_BKGRD = "\u001B[45m";
		public static final String WHITE_TXT = "\u001B[37m";
	
	private CategoryRepository categoryRepository;
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public void createCategory(Category category) {
		categoryRepository.save(category);
	}
	
	public List<Category> allCategorys(){
		return (List<Category>) categoryRepository.findAll();
	}
	
	public Category getCategoryById(Long id) {
		return categoryRepository.findOne(id);
	}
	
	//
	
	public List<Category> findProductsNotContains(Product showOneProduct) {
		List<Category> categorysWithoutShownProduct = categoryRepository.findByProductsNotContains(showOneProduct);
		return categorysWithoutShownProduct;
	}
}
