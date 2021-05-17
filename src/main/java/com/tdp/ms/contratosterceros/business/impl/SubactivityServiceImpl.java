package com.tdp.ms.contratosterceros.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdp.ms.contratosterceros.business.ISubactivityService;
import com.tdp.ms.contratosterceros.model.dao.Subactivity;
import com.tdp.ms.contratosterceros.model.dao.Process;
import com.tdp.ms.contratosterceros.repository.IProcessRepository;
import com.tdp.ms.contratosterceros.repository.ISubactivityRepository;
import com.tdp.ms.contratsterceros.model.dto.SubactivityDto;

import reactor.core.publisher.Mono;

@Service
public class SubactivityServiceImpl implements ISubactivityService {

	@Autowired
	ISubactivityRepository subactivityRepository;
	
	@Autowired
	IProcessRepository processRepository;

	@Override
	public Mono<List<Subactivity>> listar() {
		return Mono.justOrEmpty(subactivityRepository.findAll());
	}

	@Override
	public Mono<Subactivity> listarPorId(Integer id) {
		return Mono.justOrEmpty(subactivityRepository.findById(id));
	}

	@Override
	public Mono<Subactivity> registrar(SubactivityDto subactivityDTO) {

		Process process = new Process();
		process = processRepository.findById(subactivityDTO.getId_process()).orElse(null);
		
		Subactivity subactivity = new Subactivity();
		subactivity.setName(subactivityDTO.getName());
		subactivity.setId_process(process);
		subactivity.setCreatedBy(subactivityDTO.getCreatedBy());
		subactivity.setUpdatedBy(subactivityDTO.getUpdatedBy());
		return Mono.justOrEmpty(subactivityRepository.save(subactivity));
	}

	@Override
	public Mono<Subactivity> modificar(SubactivityDto subactivityDTO) {
		
		Process process = new Process();
		process = processRepository.findById(subactivityDTO.getId_process()).orElse(null);
		
		Subactivity subactivity = new Subactivity();
		subactivity.setId(subactivityDTO.getId());
		subactivity.setName(subactivityDTO.getName());
		subactivity.setId_process(process);		
		subactivity.setCreatedBy(subactivityDTO.getCreatedBy());
		subactivity.setUpdatedBy(subactivityDTO.getUpdatedBy());
		
		return Mono.justOrEmpty(subactivityRepository.save(subactivity) );
	}

	@Override
	public void eliminar(Integer id) {
		subactivityRepository.deleteById(id);
		
	}
	
	
	
}
