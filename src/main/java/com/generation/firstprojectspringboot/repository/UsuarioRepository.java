package com.generation.firstprojectspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.firstprojectspringboot.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

    Usuario findUserByUsername(String username);
}
