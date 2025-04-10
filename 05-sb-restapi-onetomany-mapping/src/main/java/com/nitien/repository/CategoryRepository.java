package com.nitien.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitien.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
