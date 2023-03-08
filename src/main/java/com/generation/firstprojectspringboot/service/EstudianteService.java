package com.generation.firstprojectspringboot.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.firstprojectspringboot.model.Estudiante;
import com.generation.firstprojectspringboot.repository.EstudianteRepository;


//HACE QUE SE CUMPLAN LAS INSTRUCCIONES DEL REPOSITORY

@Service
@Transactional

public class EstudianteService {
    //se conecta con el archivo reposritory, para poder ocupar las intruciones creadas en esta.
    private EstudianteRepository estudianteRepository;

    public EstudianteService(@Autowired EstudianteRepository estudianteRepository){
        this.estudianteRepository= estudianteRepository;
    }

public void saveEstudiante(Estudiante estudiante){
     //este .save esta haciendo el trabjo de un INSERT INTO pero el java lo reconoce por defecto, pero lo hara de manera automatica cuando reconozca este metodo 
    this.estudianteRepository.save(estudiante);
}

public void updateEstudiante(Estudiante estudiante){
    //a pesar de ser una funcion de actualizacion se ocupa el mismo metodo de guardado
    this.estudianteRepository.save(estudiante);
}

public void deleteEstudiante(Integer id){
    estudianteRepository.deleteById(id);
}

public List<Estudiante> findAll(){
    return estudianteRepository.findAll();
}

public List<Estudiante> estudiantesConLl(){
    return estudianteRepository.findEstudiantesWithLL();
}

public List<Estudiante> estudiantePorEquipo(Integer equipo){
    return estudianteRepository.findEstudianteByEquipo(equipo);
}
}
