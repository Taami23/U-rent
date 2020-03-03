package com.web.urent.repository;

<<<<<<< HEAD

import com.web.urent.model.Arriendo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArriendoRepository extends JpaRepository<Arriendo, Integer> {
}
=======
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.web.urent.model.Arriendo;
@Repository
public interface ArriendoRepository extends JpaRepository<Arriendo, Integer> {
}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f
