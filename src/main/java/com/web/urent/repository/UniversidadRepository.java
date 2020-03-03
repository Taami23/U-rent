
package com.web.urent.repository;

<<<<<<< HEAD
import com.web.urent.model.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.urent.model.Universidad;
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f
@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Integer> {

}
