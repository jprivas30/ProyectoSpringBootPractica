package com.generation.firstprojectspringboot.repository;
import com.generation.firstprojectspringboot.model.Equipo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface EquipoRepository extends JpaRepository<Equipo,Integer>{

@Query(value= "SELECT * FROM equipos WHERE equipo_id=7", nativeQuery = true)
    List <Equipo> findIntegrantesEquipos();
}
