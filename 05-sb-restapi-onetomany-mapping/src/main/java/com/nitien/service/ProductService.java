package com.nitien.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitien.entity.Product;
import com.nitien.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public void saveProduct(Product product) {
		log.info("ProductService :: saveProduct starts");
		product.setIsProdStock(true);
		product.setProdBarCode(UUID.randomUUID().toString());
		productRepository.save(product);
		log.info("ProductService :: saveProduct ends");
	}

	public Product fetchProdcut(Long prodId) {
		return productRepository.findById(prodId).orElseThrow(() -> new RuntimeException());
	}

}
