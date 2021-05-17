package com.tdp.ms.contratsterceros.model.dto;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SubactivityDto {

	private Integer id;
	
	private String name;

	private Integer id_process;
	
	private Integer createdBy;

	private Integer updatedBy;

	public SubactivityDto(Integer id, String name, Integer id_process, Integer createdBy, Integer updatedBy) {
		super();
		this.id = id;
		this.name = name;
		this.id_process = id_process;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}



	
	
	
	
	
}
