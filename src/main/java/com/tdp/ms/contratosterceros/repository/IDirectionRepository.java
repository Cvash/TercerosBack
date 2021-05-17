package com.tdp.ms.contratosterceros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdp.ms.contratosterceros.model.dao.Direction;

@Repository
public interface IDirectionRepository extends JpaRepository<Direction, Integer> {

}
