package com.tdp.ms.contratosterceros.model.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table( name = "dhr_ct_contract_expenses" )
public class Contract_expenses extends BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column( name = "name" )
	private String name;
	
	@Column( name = "1Q" )
	private Integer Q1;
	
	@Column( name = "2Q" )
	private Integer Q2;
	
	@Column( name = "3Q" )
	private Integer Q3;
	
	@Column( name = "4Q" )
	private Integer Q4;
	
}
