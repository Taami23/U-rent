package com.web.urent.repository;


import com.web.urent.model.Arriendo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArriendoRepository extends JpaRepository<Arriendo, Integer> {
}
