package com.nitien.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nitien.entity.Product;
import com.nitien.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/v1/product")
@Slf4j
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping
	public void createProduct(@RequestBody Product product) {
		log.info("ProductController :: createProduct starts");
		productService.saveProduct(product);
		log.info("ProductController :: createProduct ends");
	}
	
	@GetMapping("{prodId}")
	public Product fetchProduct(@PathVariable("prodId") Long prodId ) {
		
		return productService.fetchProdcut(prodId);
	}

}
