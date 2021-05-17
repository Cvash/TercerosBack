package com.tdp.ms.contratosterceros.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdp.ms.contratosterceros.business.IManagerService;
import com.tdp.ms.contratosterceros.model.dao.Manager;
import com.tdp.ms.contratosterceros.repository.IManagerRepository;
import com.tdp.ms.contratsterceros.model.dto.ManagerDto;

import reactor.core.publisher.Mono;

@Service
public class ManagerServiceImpl implements IManagerService {

	@Autowired
	IManagerRepository managerRepository;
	
	@Override
	public Mono<List<Manager>> listar() {
		return Mono.justOrEmpty(managerRepository.findAll());
	}

	@Override
	public Mono<Manager> listarPorId(Integer id) {
		return Mono.justOrEmpty(managerRepository.findById(id));
	}
 
	@Override
	public Mono<Manager> registrar(ManagerDto managerDTO) {
		
		Manager manager = new Manager();
		manager.setName(managerDTO.getName());
		manager.setEmail(managerDTO.getEmail());
		manager.setTelefono(managerDTO.getTelefono());
		manager.setCreatedBy(managerDTO.getCreatedBy());
		manager.setUpdatedBy(managerDTO.getCreatedBy());
		
		return Mono.justOrEmpty(managerRepository.save(manager));
	}

	@Override
	public Mono<Manager> modificar(ManagerDto managerDTO) {
		
		Manager manager = new Manager();
		manager.setName(managerDTO.getName());
		manager.setEmail(managerDTO.getEmail());
		manager.setTelefono(managerDTO.getTelefono());
		manager.setCreatedBy(managerDTO.getCreatedBy());
		manager.setUpdatedBy(managerDTO.getCreatedBy());
		return Mono.justOrEmpty(managerRepository.save(manager));
	}

	@Override
	public void eliminar(Integer id) {
		managerRepository.deleteById(id);
		
	}
	
	

}
