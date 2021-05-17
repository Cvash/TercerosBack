package com.tdp.ms.contratosterceros.business;

import java.util.List;

import com.tdp.ms.contratosterceros.model.dao.Direction;
import com.tdp.ms.contratsterceros.model.dto.DirectionDto;

import reactor.core.publisher.Mono;

public interface IDirectionService {

	Mono<List<Direction>> listar();
	
	Mono<Direction> listarPorId( Integer id );
	
	Mono<Direction> registrar(DirectionDto directionDTO);
	
	Mono<Direction> modificar(DirectionDto directionDTO);

	void eliminar(Integer id);
	
}
