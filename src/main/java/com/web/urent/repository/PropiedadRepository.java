package com.web.urent.repository;

import java.util.List;


import com.web.urent.model.Propiedad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PropiedadRepository extends JpaRepository<Propiedad, Integer> {
	@Query("select a from Propiedad a where a.estado=1")
	List<Propiedad> listar();
}
