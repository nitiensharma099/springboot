package com.nitien.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="kma.product_tbl")
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long prodId;
	private String prodName;
	private double prodPrice;
	private Integer prodQuantity;
	private String prodDescription;
	private Boolean isProdStock;
	private String prodBarCode;
	
	//many to one 
	@ManyToOne
	@JoinColumn(name="cat_id", referencedColumnName = "catId", nullable = false)
	private Category category;
	
}
