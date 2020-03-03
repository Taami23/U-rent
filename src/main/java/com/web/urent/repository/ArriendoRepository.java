package com.web.urent.repository;

import java.util.List;


import com.web.urent.model.Arriendo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ArriendoRepository extends JpaRepository<Arriendo, Integer> {
	@Query("select a from Arriendo a where a.estado=1")
	List<Arriendo> listar();
}