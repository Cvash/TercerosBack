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
public class Contract_expensesDto {
	
	//Estos valores se traen del .dao

	private Integer id;
	
	private String name;
	
	private Integer Q1;
	
	private Integer Q2;
	
	private Integer Q3;
	
	private Integer Q4;
	
	private Integer createdBy;

	private Integer updatedBy;

	//generamos el constructor
	public Contract_expensesDto(Integer id, String name, Integer q1, Integer q2, Integer q3, Integer q4,
			Integer createdBy, Integer updatedBy) {
		super();
		this.id = id;
		this.name = name;
		Q1 = q1;
		Q2 = q2;
		Q3 = q3;
		Q4 = q4;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}


	
	
	
	
	
}
