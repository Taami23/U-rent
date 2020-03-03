package com.web.urent.repository;


import com.web.urent.model.Distancia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistanciaRepository extends JpaRepository<Distancia, Integer> {

}
