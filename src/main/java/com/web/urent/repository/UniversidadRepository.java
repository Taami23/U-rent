
package com.web.urent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.urent.model.Universidad;
@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Integer> {

}
