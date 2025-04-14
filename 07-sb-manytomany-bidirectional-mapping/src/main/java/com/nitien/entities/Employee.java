package com.nitien.entities;


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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="kma_employees")
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long   empId;
	private String empFirstName;
	private String empLastName;
	private String empEmailId;
	private String empMobileNumber;
	private String empAddress;
	private String empDesignation;
	private String empBankName;
	private String empBankAccountNo;
	private String empBankIfscCode;
	

	@CreationTimestamp
	private LocalDateTime empCreatedDateTime;

	@CreatedBy
	private LocalDateTime empCreatedBy;

	@UpdateTimestamp
	private LocalDateTime empUpdatedDateTime;
	
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(
			name="employee_role",
			joinColumns= @JoinColumn(name="emp_id",referencedColumnName = "empId"),
			inverseJoinColumns= @JoinColumn(name="role_id" , referencedColumnName = "roleId")
			)
	Set<Role> role;
}

