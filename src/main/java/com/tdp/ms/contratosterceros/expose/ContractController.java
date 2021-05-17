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

import com.tdp.ms.contratosterceros.business.IContractService;
import com.tdp.ms.contratosterceros.model.dao.Contract;
import com.tdp.ms.contratsterceros.model.dto.ContractDto;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping( "/contratoterceros/v8" )
public class ContractController {
	
	@Autowired
	IContractService contractService;
	
	@GetMapping("/listarContract")
	public Mono<List<Contract>> listar() {
		return contractService.listar();
	}
	 
	@GetMapping("/listarPorId/{id}")
	public Mono<Contract> listarPorId(@PathVariable Integer id){
		return contractService.listarPorId(id);
	}

	@PostMapping("/registrarContract")
	public Mono<Contract> registrar(@RequestBody ContractDto contractDto) {
		return contractService.registrar(contractDto);
	}
	
	@PutMapping("/modificarContract")
	public Mono<Contract> modificar(@RequestBody ContractDto contractDTO) {
		return contractService.modificar(contractDTO);
	}
	
	@DeleteMapping("/eliminarContrat/{id}")
	public void eliminar(@PathVariable Integer id) {
		contractService.eliminar(id);
	}
	
}
