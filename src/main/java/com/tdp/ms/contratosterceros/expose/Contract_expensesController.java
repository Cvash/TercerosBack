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

import com.tdp.ms.contratosterceros.business.IContract_expensesService;
import com.tdp.ms.contratosterceros.model.dao.Contract_expenses;
import com.tdp.ms.contratsterceros.model.dto.Contract_expensesDto;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping( "/contratoterceros/v3" )
public class Contract_expensesController {

	@Autowired
	IContract_expensesService contract_expensesService;
	
	@GetMapping("/listarContract_expenses")
	public Mono<List<Contract_expenses>> listar() {
		return contract_expensesService.listar();
	}
	
	@GetMapping("/listarPorId/{id}")
	public Mono<Contract_expenses> listarPorId(@PathVariable Integer id) {
		return contract_expensesService.listarPorId(id);
	}
	
	@PostMapping("/registrarContractExpenses")
	public Mono<Contract_expenses> registrar(@RequestBody Contract_expensesDto contract_expensesDto) {
		return contract_expensesService.registrar(contract_expensesDto);
	}
	
	@PutMapping("/modificarContractExpenses")
	public Mono<Contract_expenses> modificar(@RequestBody Contract_expensesDto contract_expensesDTO) {
		return contract_expensesService.modificar(contract_expensesDTO);
	}
	
	@DeleteMapping("/eliminarContractExpenses/{id}")
	public void eliminar(@PathVariable Integer id) {
		contract_expensesService.eliminar(id);
	}
}
