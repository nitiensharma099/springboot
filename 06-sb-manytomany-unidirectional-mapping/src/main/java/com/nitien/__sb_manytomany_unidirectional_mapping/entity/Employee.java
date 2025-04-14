package com.nitien.__sb_manytomany_unidirectional_mapping.entity;

import java.time.LocalDateTime;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="kma.employee_tbl")
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	private String empFirstName;
	private String empLastName;
	private String empEmailId;
	private String empMobileNumber;
	private String address;

	@CreationTimestamp
	private LocalDateTime empCreatedDateTime;

	@CreatedBy
	private LocalDateTime empCreatedBy;

	@UpdateTimestamp
	private LocalDateTime empUpdatedDateTime;
	
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	Set<Role> Role;
}
