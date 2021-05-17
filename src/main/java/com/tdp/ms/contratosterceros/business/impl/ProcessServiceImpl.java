package com.tdp.ms.contratosterceros.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdp.ms.contratosterceros.business.IProcessService;
import com.tdp.ms.contratosterceros.model.dao.Process;
import com.tdp.ms.contratosterceros.repository.IProcessRepository;
import com.tdp.ms.contratsterceros.model.dto.ProcessDto;

import reactor.core.publisher.Mono;

@Service
public class ProcessServiceImpl implements IProcessService {
	
	@Autowired
	IProcessRepository processRepository;

	@Override
	public Mono<List<Process>> listar() {
		return Mono.justOrEmpty(processRepository.findAll());
	}

	@Override
	public Mono<Process> listarPorId( Integer id ) {
		return Mono.justOrEmpty(processRepository.findById(id));
	}

	@Override
	public Mono<Process> registrar(ProcessDto processDTO) {
		
		Process process = new Process();
		process.setName(processDTO.getName());
		process.setCreatedBy(processDTO.getCreatedBy());
		process.setUpdatedBy(processDTO.getUpdatedBy());
		return Mono.justOrEmpty(processRepository.save(process));
	}

	@Override
	public Mono<Process> modificar(ProcessDto processDTO) {

		Process process = new Process();
		process.setId(processDTO.getId());
		process.setName(processDTO.getName());
		process.setCreatedBy(processDTO.getCreatedBy());
		process.setUpdatedBy(processDTO.getUpdatedBy());
		return Mono.justOrEmpty(processRepository.save(process));
	}

	@Override
	public void eliminar(Integer id) {
		processRepository.deleteById(id);
		
	}
	
	

}
