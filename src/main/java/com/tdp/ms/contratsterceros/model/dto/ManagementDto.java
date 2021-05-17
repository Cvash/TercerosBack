package com.tdp.ms.contratsterceros.model.dto;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ManagementDto {

	private Integer id;

	private String name;
	
	private Integer id_direction;
	
	private Integer createdBy;

	private Integer updatedBy;

	public ManagementDto(Integer id, String name, Integer id_direction, Integer createdBy, Integer updatedBy) {
		super();
		this.id = id;
		this.name = name;
		this.id_direction = id_direction;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	
	
	
	
}
