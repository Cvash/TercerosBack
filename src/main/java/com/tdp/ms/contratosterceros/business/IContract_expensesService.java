package com.tdp.ms.contratosterceros.business;

import java.util.List;

import com.tdp.ms.contratosterceros.model.dao.Contract;
import com.tdp.ms.contratosterceros.model.dao.Contract_expenses;
import com.tdp.ms.contratsterceros.model.dto.ContractDto;
import com.tdp.ms.contratsterceros.model.dto.Contract_expensesDto;

import reactor.core.publisher.Mono;

public interface IContract_expensesService {

	Mono<List<Contract_expenses>> listar();
	
	Mono<Contract_expenses> listarPorId( Integer id );
	
	Mono<Contract_expenses> registrar(Contract_expensesDto contractExpenseDTO);
	
	Mono<Contract_expenses> modificar(Contract_expensesDto contractExpenseDTO);

	void eliminar(Integer id);
	
}
