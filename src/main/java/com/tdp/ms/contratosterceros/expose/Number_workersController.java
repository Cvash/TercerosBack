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

import com.tdp.ms.contratosterceros.business.INumber_workersService;
import com.tdp.ms.contratosterceros.model.dao.Number_workers;
import com.tdp.ms.contratsterceros.model.dto.Number_workersDto;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping( "/contratoterceros/v2" )
public class Number_workersController {

	@Autowired
	INumber_workersService number_workersService;
	
	@GetMapping("/listarNumber_workers")
	public Mono<List<Number_workers>> listar(){
		return number_workersService.listar();
	}
	
	@GetMapping("/listarPorId/{id}")
	public Mono<Number_workers> listarPorId(@PathVariable Integer id){
		return number_workersService.listarPorId(id);
	}
	
	@PostMapping("/registrarNumberWorkers")
	public Mono<Number_workers> registrar(@RequestBody Number_workersDto number_workersDto){
		return number_workersService.registrar(number_workersDto);
	}
	
	@PutMapping("/modificarNumberWorkers")
	public Mono<Number_workers> modificar(@RequestBody Number_workersDto number_workersDTO) {
		return number_workersService.modificar(number_workersDTO);
	}
	
	@DeleteMapping("/eliminarNumberWorkers/{id}") 
		public void eliminar(@PathVariable Integer id) {
			number_workersService.eliminar(id);
		}
	
	
}
