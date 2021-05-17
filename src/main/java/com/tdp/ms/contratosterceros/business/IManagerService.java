package com.tdp.ms.contratosterceros.business;

import java.util.List;

import com.tdp.ms.contratosterceros.model.dao.Manager;
import com.tdp.ms.contratsterceros.model.dto.ManagerDto;

import reactor.core.publisher.Mono;

public interface IManagerService {

	Mono<List<Manager>> listar();
	
	Mono<Manager> listarPorId( Integer id );
	
	Mono<Manager> registrar(ManagerDto managerDTO);
	
	Mono<Manager> modificar(ManagerDto managerDTO);

	void eliminar(Integer id);
	
}
