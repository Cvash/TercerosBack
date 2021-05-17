package com.tdp.ms.contratosterceros.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdp.ms.contratosterceros.business.IContract_expensesService;
import com.tdp.ms.contratosterceros.model.dao.Contract;
import com.tdp.ms.contratosterceros.model.dao.Contract_expenses;
import com.tdp.ms.contratosterceros.repository.IContract_expensesRepository;
import com.tdp.ms.contratsterceros.model.dto.ContractDto;
import com.tdp.ms.contratsterceros.model.dto.Contract_expensesDto;

import reactor.core.publisher.Mono;

@Service
public class Contract_expensesServiceImpl implements IContract_expensesService {

	@Autowired
	IContract_expensesRepository contractExposeRepository;
	
	@Override
	public Mono<List<Contract_expenses>> listar() {
		return Mono.justOrEmpty(contractExposeRepository.findAll());
	}

	@Override
	public Mono<Contract_expenses> listarPorId(Integer id) {
		return Mono.justOrEmpty(contractExposeRepository.findById(id));
	}

	@Override
	public Mono<Contract_expenses> registrar(Contract_expensesDto contractExpenseDTO) {
		
		Contract_expenses contract_expenses = new Contract_expenses();
		contract_expenses.setName(contractExpenseDTO.getName());
		contract_expenses.setQ1(contractExpenseDTO.getQ1());
		contract_expenses.setQ2(contract_expenses.getQ2());
		contract_expenses.setQ3(contractExpenseDTO.getQ3());
		contract_expenses.setQ4(contractExpenseDTO.getQ4());
		contract_expenses.setCreatedBy(contractExpenseDTO.getCreatedBy());
		contract_expenses.setUpdatedBy(contractExpenseDTO.getCreatedBy());
		return Mono.justOrEmpty(contractExposeRepository.save(contract_expenses));
	}

	@Override
	public Mono<Contract_expenses> modificar(Contract_expensesDto contractExpenseDTO) {

		Contract_expenses contract_expenses = new Contract_expenses();
		contract_expenses.setId(contractExpenseDTO.getId());
		contract_expenses.setName(contractExpenseDTO.getName());
		contract_expenses.setQ1(contractExpenseDTO.getQ1());
		contract_expenses.setQ2(contractExpenseDTO.getQ2());
		contract_expenses.setQ3(contractExpenseDTO.getQ3());
		contract_expenses.setQ4(contractExpenseDTO.getQ4());
		contract_expenses.setCreatedBy(contractExpenseDTO.getCreatedBy());
		contract_expenses.setUpdatedBy(contractExpenseDTO.getCreatedBy());
		return Mono.justOrEmpty(contractExposeRepository.save(contract_expenses));
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
