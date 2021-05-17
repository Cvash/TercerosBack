package com.tdp.ms.contratosterceros.business;

import java.util.List;

import com.tdp.ms.contratosterceros.model.dao.Subactivity;
import com.tdp.ms.contratsterceros.model.dto.SubactivityDto;

import reactor.core.publisher.Mono;

public interface ISubactivityService {

	Mono<List<Subactivity>> listar();
	
	Mono<Subactivity> listarPorId( Integer id );
	
	Mono<Subactivity> registrar(SubactivityDto subactivityDTO);
	
	Mono<Subactivity> modificar(SubactivityDto subactivityDTO);

	void eliminar(Integer id);
	
}
