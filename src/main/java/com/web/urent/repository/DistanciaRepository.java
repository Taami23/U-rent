package com.web.urent.repository;

import java.util.List;


import com.web.urent.model.Distancia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface DistanciaRepository extends JpaRepository<Distancia, Integer> {
	@Query("select a from Distancia a where a.estado=1")
	List<Distancia> listar();
}