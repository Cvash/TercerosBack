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

import com.tdp.ms.contratosterceros.business.IProcessService;
import com.tdp.ms.contratosterceros.model.dao.Process;
import com.tdp.ms.contratsterceros.model.dto.ProcessDto;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping( "/contratoterceros/v4" )
public class ProcessController {

	@Autowired  
	IProcessService processService;
	
	@GetMapping("/listarProcess")
	public Mono<List<Process>> listar() {
		return processService.listar();
	}
	
	@GetMapping("/listarPorId/{id}")
	public Mono<Process> listarPorId(@PathVariable Integer id) {
		return processService.listarPorId(id);
	}
	
	@PostMapping("/registrarProcess")
	public Mono<Process> regisrar(@RequestBody ProcessDto processDto) {
		return processService.registrar(processDto);
	}
	
	@PutMapping("/modificarProcess")
	public Mono<Process> modificar(@RequestBody ProcessDto processDTO) {
		return processService.modificar(processDTO);
	}
	
	@DeleteMapping("/eliminarProcess/{id}")
	public void eliminar(@PathVariable Integer id) {
		processService.eliminar(id);
	}
	
}
