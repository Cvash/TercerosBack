package com.tdp.ms.contratosterceros.business;

import java.util.List;

import com.tdp.ms.contratosterceros.model.dao.Process;
import com.tdp.ms.contratsterceros.model.dto.ProcessDto;

import reactor.core.publisher.Mono;

public interface IProcessService {

	Mono<List<Process>> listar();
	
	Mono<Process> listarPorId( Integer id );
	
	Mono<Process> registrar(ProcessDto processDTO);
	
	Mono<Process> modificar(ProcessDto processDTO);

	void eliminar(Integer id);
	
}
