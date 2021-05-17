package com.tdp.ms.contratsterceros.model.dto;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContractDto {
	

	private Integer id;

	private String description;
	
	private String canal;
	
	private String manager;
	
	private LocalDateTime start_date;
	
	private LocalDateTime end_date;
	
	private Boolean shopping_table;

	private String comments;
	
	private Integer id_number_workers;
	
	private Integer id_contract_expenses;
	
	private Integer id_supplier;
	
	private Integer id_subactivity;
	
	private Integer id_management;
	
	private Integer id_manager;
	
	private Integer createdBy;

	private Integer updatedBy;

	public ContractDto(Integer id, String description, String canal, String manager, LocalDateTime start_date,
			LocalDateTime end_date, Boolean shopping_table, String comments, Integer id_number_workers,
			Integer id_contract_expenses, Integer id_supplier, Integer id_subactivity, Integer id_management,
			Integer id_manager, Integer createdBy, Integer updatedBy) {
		super();
		this.id = id;
		this.description = description;
		this.canal = canal;
		this.manager = manager;
		this.start_date = start_date;
		this.end_date = end_date;
		this.shopping_table = shopping_table;
		this.comments = comments;
		this.id_number_workers = id_number_workers;
		this.id_contract_expenses = id_contract_expenses;
		this.id_supplier = id_supplier;
		this.id_subactivity = id_subactivity;
		this.id_management = id_management;
		this.id_manager = id_manager;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	
	
	
	

	
	
	
	
	

}
