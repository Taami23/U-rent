package com.web.urent.repository;

import java.util.List;


import com.web.urent.model.Sede;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface SedeRepository extends JpaRepository<Sede, Integer> {
	@Query("select a from Sede a where a.estado=1")
	List<Sede> listar();
}
