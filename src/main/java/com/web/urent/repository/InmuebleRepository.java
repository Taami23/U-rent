package com.web.urent.repository;

import java.util.List;


import com.web.urent.model.Inmueble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface InmuebleRepository extends JpaRepository<Inmueble, Integer> {
	@Query(value = "select a from Inmueble a where a.estado= 1 and a.idInmueble in (select p.id_Inmueble.idInmueble from Propiedad p where p.id_Arrendador.id_Arrendador = ?1)")
	List<Inmueble> listarArrendador(int id);


	@Query(value = "select a from Inmueble a")
	List<Inmueble> listar();
}
