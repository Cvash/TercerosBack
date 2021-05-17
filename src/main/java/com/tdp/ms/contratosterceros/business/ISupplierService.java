package com.tdp.ms.contratosterceros.business;

import java.util.List;

import com.tdp.ms.contratosterceros.model.dao.Contract;
import com.tdp.ms.contratosterceros.model.dao.Supplier;
import com.tdp.ms.contratsterceros.model.dto.ContractDto;
import com.tdp.ms.contratsterceros.model.dto.SupplierDto;

import reactor.core.publisher.Mono;

public interface ISupplierService {
	
	/* Ejemplo de muestra */
	Mono<List<Supplier>> listar();
	
	Mono<Supplier> listarPorId( Integer id );
	
	Mono<Supplier> registrar(SupplierDto suppplierDTO);
	
	Mono<Supplier> modificar(SupplierDto suppplierDTO);

	void eliminar(Integer id);

}
