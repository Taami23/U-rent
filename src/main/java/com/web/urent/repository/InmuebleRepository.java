package com.web.urent.repository;

import java.util.List;

<<<<<<< HEAD
import com.web.urent.model.Inmueble;
=======
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
@Repository
public interface InmuebleRepository extends JpaRepository<Inmueble, Integer> {
	@Query("select a from Inmueble a where a.estado=1")
=======
import com.web.urent.model.Inmueble;
@Repository
public interface InmuebleRepository extends JpaRepository<Inmueble, Integer> {
	@Query("select a from Inmueble a where a.estado=1 and a.disponibilidad=1")
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f
	List<Inmueble> listar();
}
