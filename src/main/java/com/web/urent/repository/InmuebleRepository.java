package com.web.urent.repository;

import java.util.List;


import com.web.urent.model.Inmueble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface InmuebleRepository extends JpaRepository<Inmueble, Integer> {
	@Query("select a from Inmueble a where a.estado=1")
	List<Inmueble> listar();
}