package com.tdp.ms.contratosterceros.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdp.ms.contratosterceros.business.INumber_workersService;
import com.tdp.ms.contratosterceros.model.dao.Number_workers;
import com.tdp.ms.contratosterceros.repository.INumber_workersRepository;
import com.tdp.ms.contratsterceros.model.dto.Number_workersDto;

import reactor.core.publisher.Mono;

@Service
public class Number_workersServiceImpl implements INumber_workersService {

	@Autowired
	INumber_workersRepository number_workerRepository;
	
	@Override
	public Mono<List<Number_workers>> listar() {
		return Mono.justOrEmpty(number_workerRepository.findAll());
	}

	@Override
	public Mono<Number_workers> listarPorId(Integer id) {
		return Mono.justOrEmpty(number_workerRepository.findById(id));
	}

	@Override
	public Mono<Number_workers> registrar(Number_workersDto number_workersDTO) {
		Number_workers number_workers = new Number_workers();
		number_workers.setQ1(number_workersDTO.getQ1());
		number_workers.setQ2(number_workersDTO.getQ2());
		number_workers.setQ3(number_workersDTO.getQ3());
		number_workers.setQ4(number_workersDTO.getQ4());
		number_workers.setCreatedBy(number_workersDTO.getCreatedBy());
		number_workers.setUpdatedBy(number_workersDTO.getUpdatedBy());
		
		return Mono.justOrEmpty(number_workerRepository.save(number_workers));
	}

	@Override
	public Mono<Number_workers> modificar(Number_workersDto number_workersDTO) {
		
		Number_workers number_workers = new Number_workers();
		number_workers.setId(number_workersDTO.getId());
		number_workers.setQ1(number_workersDTO.getQ1());
		number_workers.setQ2(number_workersDTO.getQ2());
		number_workers.setQ3(number_workersDTO.getQ3());
		number_workers.setQ4(number_workersDTO.getQ4());
		number_workers.setCreatedBy(number_workersDTO.getCreatedBy());
		number_workers.setUpdatedBy(number_workersDTO.getUpdatedBy());
		return Mono.justOrEmpty(number_workerRepository.save(number_workers));
	}

	@Override
	public void eliminar(Integer id) {
		number_workerRepository.deleteById(id);
	}
	
	

}
