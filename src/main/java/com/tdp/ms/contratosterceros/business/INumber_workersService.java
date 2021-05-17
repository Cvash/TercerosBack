package com.tdp.ms.contratosterceros.business;

import java.util.List;

import com.tdp.ms.contratosterceros.model.dao.Number_workers;
import com.tdp.ms.contratsterceros.model.dto.Number_workersDto;

import reactor.core.publisher.Mono;

public interface INumber_workersService {
	
	Mono<List<Number_workers>> listar();
	
	Mono<Number_workers> listarPorId( Integer id);

	Mono<Number_workers> registrar(Number_workersDto number_workersDTO);
	
	Mono<Number_workers> modificar(Number_workersDto number_workersDTO);

	void eliminar(Integer id);
	
}
