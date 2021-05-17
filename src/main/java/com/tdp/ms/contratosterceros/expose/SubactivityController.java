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

import com.tdp.ms.contratosterceros.business.ISubactivityService;
import com.tdp.ms.contratosterceros.model.dao.Subactivity;
import com.tdp.ms.contratsterceros.model.dto.SubactivityDto;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping( "/contratoterceros/v5" )
public class SubactivityController {

	@Autowired
	ISubactivityService subactivityService;
	
	@GetMapping("/listarSubactivity")
	public Mono<List<Subactivity>> listar(){
		return subactivityService.listar();
	}
	
	@GetMapping("/listarPorId/{id}")
	public Mono<Subactivity>  listarPorId(@PathVariable Integer id){
		return subactivityService.listarPorId(id);
	}
	
	@PostMapping("/registrarSubactivity")
	public Mono<Subactivity> registrar(@RequestBody SubactivityDto subactivityDto){
		return subactivityService.registrar(subactivityDto);
	}
	
	@PutMapping("/modificarSubactivity")
	public Mono<Subactivity> modificar(@RequestBody SubactivityDto subactivityDTO) {
		return subactivityService.modificar(subactivityDTO);
	}
	
	@DeleteMapping("/eliminarSubactivity/{id}")
	public void eliminar(@PathVariable Integer id) {
		subactivityService.eliminar(id);
	}
	
}
