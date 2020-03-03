package com.web.urent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.web.urent.model.Arriendo;
@Repository
public interface ArriendoRepository extends JpaRepository<Arriendo, Integer> {
}
