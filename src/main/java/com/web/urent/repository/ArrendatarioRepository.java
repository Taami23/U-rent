package com.web.urent.repository;

import java.util.List;

<<<<<<< HEAD
import com.web.urent.model.Arrendatario;
=======
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
=======
import com.web.urent.model.Arrendatario;
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f
@Repository
public interface ArrendatarioRepository extends JpaRepository<Arrendatario, Integer> {
	@Query("select a from Arrendatario a where a.estado=1")
	List<Arrendatario> listar();
}
