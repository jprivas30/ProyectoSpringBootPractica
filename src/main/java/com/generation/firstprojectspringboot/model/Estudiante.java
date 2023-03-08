package com.generation.firstprojectspringboot.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//permite decirle al objeto que hara referencia a una tabla de la base datos y le podemos entregar el nombre de la tabla de manera explicita
@Entity(name="estudiantes")
public class Estudiante {
    //estos dos datos nos permiten especificar a la base que el siguiente atributo es el id de la tabla 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer estudiante_id;
    private String nombre;
    private String apellido;
    private Integer equipo_id;


public Estudiante() {
}

public Estudiante(Integer estudiante_id, String nombre, String apellido, Integer equipo_id){
    this.estudiante_id = estudiante_id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.equipo_id = equipo_id;
}

public Integer getEstudiante_id() {
    return estudiante_id;
}

public void setEstudiante_id(Integer estudiante_id) {
    this.estudiante_id = estudiante_id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public Integer getEquipo_id() {
    return equipo_id;
}

public void setEquipo_id(Integer equipo_id) {
    this.equipo_id = equipo_id;
}


}
