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

import com.tdp.ms.contratosterceros.business.IManagementService;
import com.tdp.ms.contratosterceros.model.dao.Management;
import com.tdp.ms.contratsterceros.model.dto.ManagementDto;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping( "/contratoterceros/v7" )
public class ManagementController {

	@Autowired
	IManagementService managementService;
	
	@GetMapping("/listarManagement")
	public Mono<List<Management>> listar() {
		return managementService.listar();
	}
	
	@GetMapping("/listarPorId/{id}")
	public Mono<Management> listarPorId(@PathVariable Integer id) {
		return managementService.listarPorId(id);
	}
	
	@PostMapping("/registrarManagement")
	public Mono<Management> registrar(@RequestBody ManagementDto managementDto) {
		return managementService.registrar(managementDto);
	}
	
	@PutMapping("/modificarManagement")
	public Mono<Management> modificar(@RequestBody ManagementDto managementDTO) {
		return managementService.modificar(managementDTO);
	}
	
	@DeleteMapping("/eliminarManagement/{id}")
	public void eliminar(@PathVariable Integer id) {
		managementService.eliminar(id);
	}
	
}
