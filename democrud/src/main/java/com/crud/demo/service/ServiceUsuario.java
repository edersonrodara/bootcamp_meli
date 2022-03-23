package com.crud.demo.service;

import com.crud.demo.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceUsuario {
    List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> findAll () {
        return usuarios;
    }

    public Usuario create (Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }

    public Usuario findById (int id) {
        return usuarios.stream().filter(x -> x.getId() == id).findAny().get();
    }

    public void delete (int id) {
        usuarios.removeIf(x -> x.getId() == id);
    }
}
