package com.quiz.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.Category;
import com.quiz.service.CategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/")
	public ResponseEntity<Category> addCategory(@RequestBody Category category){
		Category category1=categoryService.addCategory(category);
		return new ResponseEntity(category,HttpStatus.OK);
	}
	
	@GetMapping("/{categoryId}")
	public Category getCategory(@PathVariable("categoryId")Long categoryId) {
		return this.categoryService.getCategory(categoryId);
		
	}
	@GetMapping("/")
	
	public ResponseEntity<?> getCategories(){
		return ResponseEntity.ok(this.categoryService.getCategories());
	}
	
	@PutMapping("/")
	public Category updateCategory(@RequestBody Category category) {
		return this.categoryService.updateCategory(category);
	
		
	}
	@DeleteMapping("/{categoryId}")
	public void deleteCategory(@PathVariable("categoryId")Long categoryId) {
		this.categoryService.deleteCategory(categoryId);
	}

}
