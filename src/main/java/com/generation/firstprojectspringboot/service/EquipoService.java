package com.generation.firstprojectspringboot.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.firstprojectspringboot.model.Equipo;
import com.generation.firstprojectspringboot.repository.EquipoRepository;
import java.util.List;

@Service
@Transactional

public class EquipoService {
        //se conecta con el archivo reposritory, para poder ocupar las intruciones creadas en esta.
        private EquipoRepository equipoRepository;
    
        public EquipoService(@Autowired EquipoRepository equipoRepository){
            this.equipoRepository= equipoRepository;
        }
    
    public void saveEquipo(Equipo equipo){
        this.equipoRepository.save(equipo);
    }
    
    public void updateEquipo(Equipo equipo){
        this.equipoRepository.save(equipo);
    }
    
    public void deleteEquipo(Integer id){
        equipoRepository.deleteById(id);
    }
    
    public List<Equipo> findAll(){
        return equipoRepository.findAll();
    }
    
    public List<Equipo> encontrarEquipo(){
        return equipoRepository.findIntegrantesEquipos();

    }
}
