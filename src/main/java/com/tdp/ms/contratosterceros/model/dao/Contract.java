package com.tdp.ms.contratosterceros.model.dao;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.tdp.ms.contratosterceros.model.util.BaseModel;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@Table( name = "dhr_ct_contract" )
public class Contract extends BaseModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column( name = "description" )
	private String description;
	
	@Column( name = "canal" )
	private String canal;
	
	@Column( name = "manager" )
	private String manager;
	
	@Column( name = "start_date" )
	private LocalDateTime start_date;
	
	@Column( name = "end_date" )
	private LocalDateTime end_date;
	
	@Column( name = "shopping_table" )
	private Boolean shopping_table;
	
	@Column( name = "comments" )
	private String comments;
	
	@ManyToOne
	@JoinColumn(name="id_number_workers")
	Number_workers id_number_workers;
	
	@ManyToOne
	@JoinColumn(name="id_contract_expenses")
	Contract_expenses id_contract_expenses;
	
	@ManyToOne
	@JoinColumn(name="id_supplier")
	Supplier id_supplier;
	
	@ManyToOne
	@JoinColumn(name="id_subactivity")
	Subactivity id_subactivity;
	
	@ManyToOne
	@JoinColumn(name="id_management")
	Management id_management;
	
	@ManyToOne
	@JoinColumn(name="id_manager")
	Manager id_manager;


}
