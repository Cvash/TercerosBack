package com.tdp.ms.contratsterceros.model.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ManagerDto {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private String telefono;
	
	private Integer createdBy;

	private Integer updatedBy;

	public ManagerDto(Integer id, String name, String email, String telefono, Integer createdBy, Integer updatedBy) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.telefono = telefono;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	
	
	
	
}
