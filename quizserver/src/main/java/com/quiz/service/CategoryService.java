package com.quiz.service;


import java.util.Set;

import javax.persistence.EntityNotFoundException;

import com.quiz.entities.Category;
import com.quiz.repository.CategoryRepository;

public interface CategoryService {
	public Category addCategory(Category category);
	public Category updateCategory(Category Category);
	public Set<Category> getCategories();
	public Category getCategory(Long categoryId);
	public void deleteCategory(Long categoryId);
	

}
