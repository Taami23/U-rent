package com.web.urent.repository;

import java.util.List;

import com.web.urent.model.Arrendador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ArrendadorRepository extends JpaRepository<Arrendador, Integer> {
	@Query("select a from Arrendador a where a.estado=1")
	List<Arrendador> listar();
}
