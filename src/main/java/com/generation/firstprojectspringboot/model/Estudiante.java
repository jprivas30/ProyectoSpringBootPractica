package com.generation.firstprojectspringboot.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//permite decirle al objeto que hara referencia a una tabla de la base datos y le podemos entregar el nombre de la tabla de manera explicita
@Entity(name="estudiantes")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class Estudiante {
    //estos dos datos nos permiten especificar a la base que el siguiente atributo es el id de la tabla 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer estudiante_id;
    private String nombre;
    private String apellido;
    private Integer equipo_id;


}
