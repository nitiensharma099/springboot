package com.nitien.__sb_manytomany_unidirectional_mapping.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="kma.role_tble")
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
}
