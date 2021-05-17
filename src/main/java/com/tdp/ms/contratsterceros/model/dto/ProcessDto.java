package com.tdp.ms.contratsterceros.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProcessDto {

	private Integer id;
	
	private String name;
	
	private Integer createdBy;

	private Integer updatedBy;

	public ProcessDto(Integer id, String name, Integer createdBy, Integer updatedBy) {
		super();
		this.id = id;
		this.name = name;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	
	
}
