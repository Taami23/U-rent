package com.web.urent.repository;

import java.util.List;


import com.web.urent.model.Arriendo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ArriendoRepository extends JpaRepository<Arriendo, Integer> {
	@Query(value = "select a from Arriendo a where a.estado=1 and a.id_Arrendador.id_Arrendador= ?1")
	List<Arriendo> listarArrendador(int id);

	@Query(value = "select a from Arriendo a where a.estado=1 and a.id_Arrendatario.id_Arrendatario= ?1")
	List<Arriendo> listarArrendatario(int id);

	@Query(value = "select a from Arriendo a")
	List<Arriendo> listar();
}
