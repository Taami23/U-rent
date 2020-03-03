package com.web.urent.repository;

import java.util.List;


import com.web.urent.model.Universidad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Integer> {
	@Query("select a from Universidad a where a.estado=1")
	List<Universidad> listar();
}
