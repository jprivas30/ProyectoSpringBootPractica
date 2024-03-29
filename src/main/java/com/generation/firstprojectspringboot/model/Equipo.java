package com.generation.firstprojectspringboot.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name="equipos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer equipo_id;
    private String nombre_proyecto;
    private Integer integrantes;

}
