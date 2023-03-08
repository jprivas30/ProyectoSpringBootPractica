package com.generation.firstprojectspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.firstprojectspringboot.model.Estudiante;

//responsable de crear consultas.CREAR LAS INSTRUCCIONES
//interfaz, nos permite hacer instrucciones para poder ocuparlas despues 
//Vas a crear un archivo repositorio en donde al conectar a la base 
//Vas a trabjar con objetos de tipo estudiante, el cual tiene un id de tipo integer 

public interface EstudianteRepository extends JpaRepository<Estudiante,Integer>{

//esta es una query nativa sin parametros que nos permite obtener los estudiantes que tengan una ll en su nombre, es una consulta personalizada
    @Query(value= "SELECT * FROM estudiantes where nombre like ('%ll%')", nativeQuery = true)
    List <Estudiante> findEstudiantesWithLL();

//esta es otra query nativa con parametros que nos permite obtener los estudiantes pertenecientes a un equipo el cual yo voyt a especificar cuando llame a esta consulta, tambien es una consulta personalizda.
//@Query(value = "SELECT * FROM estudiantes WHERE equipo_id= ?1 AND nombre= ?2",nativeQuery = true)

    @Query(value = "SELECT * FROM estudiantes WHERE equipo_id= ?1",nativeQuery = true) 
    List <Estudiante> findEstudianteByEquipo(Integer equipo);

//como hacer una funcion de modificacion en querys nativas
//ojo este ejemplo es de otro proyecto
/*@Modifying
@Query(value = "UPDATE PRODUCT p SET p.STOCK = p.stock+10 WHERE p.id = ?1", nativeQuery = true)
void sumarStock(Long recetaID);*/


}
