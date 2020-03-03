package com.web.urent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.urent.model.Distancia;
@Repository
public interface DistanciaRepository extends JpaRepository<Distancia, Integer> {

}
