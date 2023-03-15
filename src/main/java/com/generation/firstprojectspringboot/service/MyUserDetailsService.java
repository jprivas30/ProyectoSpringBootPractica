package com.generation.firstprojectspringboot.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.generation.firstprojectspringboot.model.Usuario;
import com.generation.firstprojectspringboot.model.UsuarioDTO;
import com.generation.firstprojectspringboot.repository.UsuarioRepository;

@Service

public class MyUserDetailsService implements UserDetailsService {

    //inyeccion de dependencias par acceder al metodo del repositorio desde esta clase (ya que estamos en una carpeta distinta)
    @Autowired
    private UsuarioRepository usuarioRepository;

    //metodo para buscar al usuario por username, haciendo el llamado al repositorio
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario= usuarioRepository.findUserByUsername(username);
        return new org.springframework.security.core.userdetails.User(usuario.getUsername(), usuario.getPassword(), new ArrayList<>());
    }

    //metodo para crear un nuevo usuario 

    public Usuario createUser(UsuarioDTO usuarioDTO){
        Usuario usuario= new Usuario();
        usuario.setUsername(usuarioDTO.getUsername());
        usuario.setPassword(usuarioDTO.getPassword());
        return usuarioRepository.save(usuario);
    }
}
