package com.tdp.ms.contratosterceros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdp.ms.contratosterceros.model.dao.Contract_expenses;

@Repository
public interface IContract_expensesRepository extends JpaRepository<Contract_expenses, Integer> {

}
