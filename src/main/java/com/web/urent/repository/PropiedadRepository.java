package com.web.urent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.urent.model.Propiedad;
@Repository
public interface PropiedadRepository extends JpaRepository<Propiedad, Integer> {

}
