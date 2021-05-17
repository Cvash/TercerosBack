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

import com.tdp.ms.contratosterceros.business.IManagerService;
import com.tdp.ms.contratosterceros.model.dao.Manager;
import com.tdp.ms.contratsterceros.model.dto.ManagerDto;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping( "/contratoterceros/v9" )
public class ManagerController {
	
	@Autowired
	IManagerService managerService;
	
	@GetMapping("/listarManager")
	public Mono<List<Manager>> listar(){
		return managerService.listar();
	}
	
	@GetMapping("/listarPorId/{id}")
	public Mono<Manager> listarPorId(@PathVariable Integer id){
		return managerService.listarPorId(id);
	}
	
	@PostMapping("/registrarManager")
	public Mono<Manager> registrar(@RequestBody ManagerDto managerDto) {
		return managerService.registrar(managerDto);
	}
	
	@PutMapping("/modificarManager")
	public Mono<Manager> modificar(@RequestBody ManagerDto managerDto) {
		return managerService.modificar(managerDto);
	}
	
	@DeleteMapping("/eliminarManager/{id}")
	public void eliminar(@PathVariable Integer id) {
		managerService.eliminar(id);
	}
	
}
