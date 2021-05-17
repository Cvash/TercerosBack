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

import com.tdp.ms.contratosterceros.business.ISupplierService;
import com.tdp.ms.contratosterceros.model.dao.Supplier;
import com.tdp.ms.contratsterceros.model.dto.SupplierDto;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping( "/contratoterceros/v1" )
public class SupplierController {
	
	@Autowired 
	ISupplierService supplierService;
	
	@GetMapping("/listarSupplier")
	public Mono<List<Supplier>> listar(){
		return supplierService.listar();
	}

	@GetMapping("/listarPorId/{id}")
	public Mono<Supplier> listarPorId(@PathVariable Integer id) {
		return supplierService.listarPorId(id);
	}
	
	@PostMapping("/registrarSupplier")
	public Mono<Supplier> registrar(@RequestBody SupplierDto suppplierDTO) {
		return supplierService.registrar(suppplierDTO);
	}
	
	@PutMapping("/modificarSupplier")
	public Mono<Supplier> modificar(@RequestBody SupplierDto supplierDTO) {
		return supplierService.modificar(supplierDTO);
	}
	
	@DeleteMapping("/eliminarSupplier/{id}")
	public void eliminar(@PathVariable Integer id) {
		supplierService.eliminar(id);
	}
	
}
