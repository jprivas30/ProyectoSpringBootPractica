package com.generation.firstprojectspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.firstprojectspringboot.model.Equipo;
import com.generation.firstprojectspringboot.service.EquipoService;

@Controller
@CrossOrigin("*")
@RestController

public class EquipoController {
    private EquipoService equipoService;

    public EquipoController(@Autowired EquipoService equipoService){
        this.equipoService= equipoService;
    }
    
    @PostMapping("/equipo/Save")
    public void guardarEquipo(@RequestBody Equipo equipo){
        equipoService.saveEquipo(equipo);
    }

    @PutMapping("/equipo/Update")
    public void editarEquipo(@RequestBody Equipo equipo){
        equipoService.updateEquipo(equipo);
    }

    @DeleteMapping("/equipo/Delete/{id}")
    public void eliminarEquipo(@PathVariable Integer id){
        equipoService.deleteEquipo(id);
    }

    @GetMapping("/equipo/FindAll")
    public List <Equipo> obtenerEquipo(){
        return equipoService.findAll();
    }

    @GetMapping("/equipo/mejorEquipo")
    public List <Equipo> encontrarEquipos(){
        return equipoService.encontrarEquipo();
    }

}
