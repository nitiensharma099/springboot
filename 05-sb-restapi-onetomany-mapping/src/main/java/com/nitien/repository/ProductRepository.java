package com.nitien.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitien.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
