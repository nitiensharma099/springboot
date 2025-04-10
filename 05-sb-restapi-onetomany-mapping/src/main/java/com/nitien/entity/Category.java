package com.nitien.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="kma.category_tbl")
@Data
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long catId;
	private String catName;
	
	// one category has many product /// Mobile --- Iphone, samsun etc
	@OneToMany(mappedBy = "category")
	@JsonIgnore
	private List<Product> product;
	
}
