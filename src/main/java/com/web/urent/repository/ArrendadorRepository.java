package com.web.urent.repository;

import java.util.List;

<<<<<<< HEAD
import com.web.urent.model.Arrendador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.web.urent.model.Arrendador;

@Repository
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f
public interface ArrendadorRepository extends JpaRepository<Arrendador, Integer> {
	@Query("select a from Arrendador a where a.estado=1")
	List<Arrendador> listar();
}
