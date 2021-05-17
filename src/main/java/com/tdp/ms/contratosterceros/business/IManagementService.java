package com.tdp.ms.contratosterceros.business;

import java.util.List;

import com.tdp.ms.contratosterceros.model.dao.Management;
import com.tdp.ms.contratsterceros.model.dto.ManagementDto;

import reactor.core.publisher.Mono;

public interface IManagementService {

	Mono<List<Management>> listar();
	
	Mono<Management> listarPorId( Integer id );
	
	Mono<Management> registrar(ManagementDto managementDTO);
	
	Mono<Management> modificar(ManagementDto managementDTO);

	void eliminar(Integer id);
	
}
