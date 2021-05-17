package com.tdp.ms.contratosterceros.expose;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdp.ms.contratosterceros.business.IDirectionService;
import com.tdp.ms.contratosterceros.model.dao.Direction;
import com.tdp.ms.contratsterceros.model.dto.DirectionDto;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/contratoterceros/v6")
public class DirectionController {

	@Autowired
	IDirectionService directionService;

	@GetMapping("/listarDirection")
	public Mono<List<Direction>> listar() {
		return directionService.listar();
	}

	@GetMapping("/listarPorId/{id}")
	public Mono<Direction> listarPOrId(@PathVariable Integer id) {
		return directionService.listarPorId(id);
	}
	
	@PostMapping("/registrarDirection")
	public Mono<Direction> registrar(@RequestBody DirectionDto directionDto) {
		return directionService.registrar(directionDto);
	}
	
	@PutMapping("/modificarDirection")
	public Mono<Direction> modificar(@RequestBody DirectionDto directionDTO) {
		return directionService.modificar(directionDTO);
	}

	@DeleteMapping("/eliminarDirection/{id}")
	public void eliminar(@PathVariable Integer id) {
		directionService.eliminar(id);
	}
}
