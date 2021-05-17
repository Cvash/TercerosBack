package com.tdp.ms.contratosterceros.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdp.ms.contratosterceros.business.IDirectionService;
import com.tdp.ms.contratosterceros.model.dao.Direction;
import com.tdp.ms.contratosterceros.repository.IDirectionRepository;
import com.tdp.ms.contratsterceros.model.dto.DirectionDto;

import reactor.core.publisher.Mono;

@Service
public class DirectionServiceImpl implements IDirectionService {

	@Autowired
	IDirectionRepository directionRepository;
	
	@Override
	public Mono<List<Direction>> listar() {
		return Mono.justOrEmpty(directionRepository.findAll());
	}

	@Override
	public Mono<Direction> listarPorId(Integer id) {
		return Mono.justOrEmpty(directionRepository.findById(id));
	}

	@Override
	public Mono<Direction> registrar(DirectionDto directionDTO) {
		
		Direction direction = new Direction();
		direction.setName(directionDTO.getName());
		direction.setCreatedBy(directionDTO.getCreatedBy());
		direction.setUpdatedBy(directionDTO.getUpdatedBy());
		return Mono.justOrEmpty(directionRepository.save(direction));
	}

	@Override
	public Mono<Direction> modificar(DirectionDto directionDTO) {

		Direction direction = new Direction();
		direction.setId(directionDTO.getId());
		direction.setName(directionDTO.getName());
		direction.setCreatedBy(directionDTO.getCreatedBy());
		direction.setUpdatedBy(directionDTO.getUpdatedBy());
		return Mono.justOrEmpty(directionRepository.save(direction));
	}

	@Override
	public void eliminar(Integer id) {
		directionRepository.deleteById(id);
	}



}
