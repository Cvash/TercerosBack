package com.tdp.ms.contratosterceros.business;

import java.util.List;

import com.tdp.ms.contratosterceros.model.dao.Contract;
import com.tdp.ms.contratsterceros.model.dto.ContractDto;

import reactor.core.publisher.Mono;

public interface IContractService {

	Mono<List<Contract>> listar();
	
	Mono<Contract> listarPorId( Integer id );
	
	Mono<Contract> registrar(ContractDto contractDTO);
	
	Mono<Contract> modificar(ContractDto contractDTO);

	void eliminar(Integer id);
	
}
