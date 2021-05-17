package com.tdp.ms.contratosterceros.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdp.ms.contratosterceros.business.IContractService;
import com.tdp.ms.contratosterceros.model.dao.Contract;
import com.tdp.ms.contratosterceros.model.dao.Contract_expenses;
import com.tdp.ms.contratosterceros.model.dao.Management;
import com.tdp.ms.contratosterceros.model.dao.Manager;
import com.tdp.ms.contratosterceros.model.dao.Number_workers;
import com.tdp.ms.contratosterceros.model.dao.Subactivity;
import com.tdp.ms.contratosterceros.model.dao.Supplier;
import com.tdp.ms.contratosterceros.repository.IContractRepository;
import com.tdp.ms.contratosterceros.repository.IContract_expensesRepository;
import com.tdp.ms.contratosterceros.repository.IManagementRepository;
import com.tdp.ms.contratosterceros.repository.IManagerRepository;
import com.tdp.ms.contratosterceros.repository.INumber_workersRepository;
import com.tdp.ms.contratosterceros.repository.ISubactivityRepository;
import com.tdp.ms.contratosterceros.repository.ISupplierRepository;
import com.tdp.ms.contratsterceros.model.dto.ContractDto;

import reactor.core.publisher.Mono;

@Service
public class ContractServiceImpl implements IContractService {

	@Autowired
	IContractRepository contractRepository;
	
	@Autowired
	INumber_workersRepository numberWorkersRepository;
	
	@Autowired
	IManagementRepository managementRepository;
	
	@Autowired
	IContract_expensesRepository contractExpenseRepository;
	
	@Autowired
	ISubactivityRepository subactivityRepository;
	
	@Autowired
	ISupplierRepository supplierRepository;
	
	@Autowired
	IManagerRepository managerRepository;
	
	@Override
	public Mono<List<Contract>> listar() {
		return Mono.justOrEmpty(contractRepository.findAll());
	}

	@Override
	public Mono<Contract> listarPorId( Integer id) {
		return Mono.justOrEmpty(contractRepository.findById(id));
	}

	@Override
	public Mono<Contract> registrar(ContractDto contractDTO) {		
		
		Number_workers number_workers = new Number_workers();
		number_workers = numberWorkersRepository.findById(contractDTO.getId_number_workers()).orElse(null);
		
		Management managment = new Management();
		managment = managementRepository.findById(contractDTO.getId_management()).orElse(null);
		
		Contract_expenses contractExpenses = new Contract_expenses();
		contractExpenses = contractExpenseRepository.findById(contractDTO.getId_contract_expenses()).orElse(null);
		
		Subactivity subactivity = new Subactivity();
		subactivity = subactivityRepository.findById(contractDTO.getId_subactivity()).orElse(null);
		
		Supplier supplier = new Supplier();
		supplier = supplierRepository.findById(contractDTO.getId_supplier()).orElse(null);
		
		Manager manager = new Manager();
		manager = managerRepository.findById(contractDTO.getId_manager()).orElse(null);
		
		Contract contract = new Contract();
		contract.setCanal(contractDTO.getCanal());
		contract.setComments(contractDTO.getComments());
		contract.setDescription(contractDTO.getDescription());
		contract.setStart_date(contract.getStart_date());
		contract.setEnd_date(contractDTO.getEnd_date());
		contract.setId(contractDTO.getId());
		contract.setCreatedBy(contractDTO.getCreatedBy());
		contract.setUpdatedBy(contractDTO.getUpdatedBy());
		//  llaves foraneas
		contract.setId_management(managment);
		contract.setId_contract_expenses(contractExpenses);
		contract.setId_number_workers(number_workers);
		contract.setId_subactivity(subactivity);
		contract.setId_supplier(supplier);
		contract.setId_manager(manager);
		
		return Mono.justOrEmpty(contractRepository.save(contract));
	}

	@Override
	public Mono<Contract> modificar(ContractDto contractDTO) {

		Number_workers number_workers = new Number_workers();
		number_workers = numberWorkersRepository.findById(contractDTO.getId_number_workers()).orElse(null);
		
		Contract_expenses contract_expenses = new Contract_expenses();
		contract_expenses = contractExpenseRepository.findById(contractDTO.getId_contract_expenses()).orElse(null);
		
		Supplier supplier = new Supplier();
		supplier = supplierRepository.findById(contractDTO.getId_supplier()).orElse(null);
	
		Subactivity subactivity = new Subactivity();
		subactivity = subactivityRepository.findById(contractDTO.getId_subactivity()).orElse(null);
		
		Management management = new Management();
		management = managementRepository.findById(contractDTO.getId_management()).orElse(null);
		
		Contract contract = new Contract();
		contract.setDescription(contractDTO.getDescription());
		contract.setCanal(contractDTO.getCanal());
		contract.setManager(contractDTO.getManager());
		contract.setStart_date(contractDTO.getStart_date());
		contract.setEnd_date(contractDTO.getStart_date());
		contract.setShopping_table(contract.getShopping_table());
		contract.setComments(contract.getComments());
		/* Añadir los Id de los demas */
		contract.setId_number_workers(number_workers);
		contract.setId_contract_expenses(contract_expenses);
		contract.setId_supplier(supplier);
		contract.setId_subactivity(subactivity);
		contract.setId_management(management);
		contract.setCreatedBy(contractDTO.getCreatedBy());
		contract.setUpdatedBy(contractDTO.getUpdatedBy());
		return Mono.justOrEmpty(contractRepository.save(contract));
	}

	@Override
	public void eliminar(Integer id) {
		contractRepository.deleteById(id);
	}

}
