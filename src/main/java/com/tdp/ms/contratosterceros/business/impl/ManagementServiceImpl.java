package com.tdp.ms.contratosterceros.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdp.ms.contratosterceros.business.IManagementService;
import com.tdp.ms.contratosterceros.model.dao.Direction;
import com.tdp.ms.contratosterceros.model.dao.Management;
import com.tdp.ms.contratosterceros.repository.IDirectionRepository;
import com.tdp.ms.contratosterceros.repository.IManagementRepository;
import com.tdp.ms.contratsterceros.model.dto.ManagementDto;

import reactor.core.publisher.Mono;

@Service
public class ManagementServiceImpl implements IManagementService {

	@Autowired
	IManagementRepository managementRepository;
	
	@Autowired
	IDirectionRepository directionRepository;
	
	@Override
	public Mono<List<Management>> listar() {
		return Mono.justOrEmpty(managementRepository.findAll());
	}

	@Override
	public Mono<Management> listarPorId(Integer id) {
		return Mono.justOrEmpty(managementRepository.findById(id));
	}

	@Override
	public Mono<Management> registrar(ManagementDto managementDTO) {
		
		Direction direction = new Direction();
		direction = directionRepository.findById(managementDTO.getId_direction()).orElse(null);
		
		Management management = new Management();
		management.setName(managementDTO.getName());
		management.setId_direction(direction);
		management.setCreatedBy(managementDTO.getCreatedBy());
		management.setUpdatedBy(managementDTO.getUpdatedBy());
		return Mono.justOrEmpty(managementRepository.save(management));
	}

	@Override
	public Mono<Management> modificar(ManagementDto managementDTO) {

		Direction direction = new Direction();
		direction = directionRepository.findById(managementDTO.getId_direction()).orElse(null);
		
		Management management = new Management();
		management.setId(managementDTO.getId());
		management.setName(managementDTO.getName());
		management.setId_direction(direction);
		management.setCreatedBy(managementDTO.getCreatedBy());
		management.setUpdatedBy(managementDTO.getUpdatedBy());
		return Mono.justOrEmpty(managementRepository.save(management));
	}

	@Override
	public void eliminar(Integer id) {
		managementRepository.deleteById(id);
		
	}
	
	

}
