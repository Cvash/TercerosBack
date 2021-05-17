package com.tdp.ms.contratosterceros.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdp.ms.contratosterceros.business.ISupplierService;
import com.tdp.ms.contratosterceros.model.dao.Supplier;
import com.tdp.ms.contratosterceros.repository.ISupplierRepository;
import com.tdp.ms.contratsterceros.model.dto.SupplierDto;

import reactor.core.publisher.Mono;

@Service
public class SupplierServiceImpl implements ISupplierService {

	/*  Se instancia el repository para obtener los métodos   */
	@Autowired
	ISupplierRepository supplierRepository;
	
	/* Retorna una lista de valores */
	@Override
	public Mono<List<Supplier>> listar() {
		return Mono.justOrEmpty(supplierRepository.findAll());
	}

	/* Retorna solo un valor */ 
	@Override
	public Mono<Supplier> listarPorId(Integer id) {
		return Mono.justOrEmpty(supplierRepository.findById(id));
	}

	@Override
	public Mono<Supplier> registrar(SupplierDto supplierDTO) {
		
		Supplier supplier = new Supplier();
		supplier.setName(supplierDTO.getName());
		supplier.setCreatedBy(supplierDTO.getCreatedBy());
		supplier.setUpdatedBy(supplierDTO.getUpdatedBy());
		
		return Mono.justOrEmpty(supplierRepository.save(supplier));
	}

	@Override
	public Mono<Supplier> modificar(SupplierDto supplierDTO) {
		
		Supplier supplier = new Supplier();
		supplier.setId(supplierDTO.getId());
		supplier.setName(supplierDTO.getName());
		supplier.setCreatedBy(supplierDTO.getCreatedBy());
		supplier.setUpdatedBy(supplierDTO.getUpdatedBy());
		return Mono.justOrEmpty(supplierRepository.save(supplier));
	}

	@Override
	public void eliminar(Integer id) {
		supplierRepository.deleteById(id);
	}
	
	

}
