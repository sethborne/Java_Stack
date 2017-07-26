package com.sethborne.assignmentthree.productsandcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sethborne.assignmentthree.productsandcategories.models.Category;
import com.sethborne.assignmentthree.productsandcategories.models.Product;
import com.sethborne.assignmentthree.productsandcategories.repositories.CategoryRepository;

@Service

public class CategoryService {
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
