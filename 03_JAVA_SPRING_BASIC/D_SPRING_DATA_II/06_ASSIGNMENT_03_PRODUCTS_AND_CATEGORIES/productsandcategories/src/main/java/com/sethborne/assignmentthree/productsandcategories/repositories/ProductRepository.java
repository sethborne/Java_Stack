package com.sethborne.assignmentthree.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sethborne.assignmentthree.productsandcategories.models.Category;
import com.sethborne.assignmentthree.productsandcategories.models.Product;

@Repository

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findByCategorysNotContains(Category notProductCategory);
}
