package com.nitien.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nitien.entity.Category;
import com.nitien.service.CategoryService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/category")
@Slf4j
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping
	public void createCategory(@RequestBody Category category) {
		log.info("CategoryController :: createCategory started");
		categoryService.saveCategory(category);
		log.info("CategoryController :: createCategory ends");
		
	}
	
	@GetMapping("{catId}")
	public void getCategory(@PathVariable Long catId) {
		log.info("CategoryController :: getCategory started");
		categoryService.getCategory(catId);
		log.info("CategoryController :: getCategory ends");
		
	}

}
