package com.tdp.ms.contratosterceros.model.dao;

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
@Table( name = "dhr_ct_subactivity" )
public class Subactivity extends BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column( name = "name" )
	private String name;

	@ManyToOne
	@JoinColumn(name="id_process")
	Process id_process;
}
