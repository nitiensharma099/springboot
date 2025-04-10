package com.nitien.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitien.entity.Category;
import com.nitien.repository.CategoryRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public void saveCategory(Category category) {
		log.info("CategoryService :: saveCategory started");
		categoryRepository.save(category);
		log.info("CategoryService :: saveCategory started");
		
	}

	public void getCategory(Long catId) {
		//categoryRepository.findById(catId).or;
	}

}
