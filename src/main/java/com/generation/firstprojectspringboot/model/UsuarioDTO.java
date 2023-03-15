package com.generation.firstprojectspringboot.model;

//Es un tipo de objeto que se usa para pasar los datos DTO -> Direct Transfer Object


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioDTO {

    private String username;
    private String password;
}
