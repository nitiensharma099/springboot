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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="kma_roles")
@Data
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roleId;
	private String roleName;
	@CreationTimestamp
	private LocalDateTime roleCreatedDateTime;
	@CreatedBy
	private String roleCreatedBy;
	@UpdateTimestamp
	private LocalDateTime roleUpdatedDateTime;
	
	@ManyToMany(mappedBy = "role", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	Set<Employee> employee;
}

