package com.crud.demo.controller;

import com.crud.demo.service.ServiceUsuario;
import com.crud.demo.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ControllerUsuario {

    @Autowired
    private ServiceUsuario serviceUsuario;

    @PostMapping("/create")
    public Usuario create (@RequestBody Usuario usuario) {
        return serviceUsuario.create(usuario);
    }

    @GetMapping("/findAll")
    public List<Usuario> findAll () {
        return serviceUsuario.findAll();
    }

    @GetMapping("/{id}")
    public Usuario findById (@PathVariable int id) {
        return serviceUsuario.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById (@PathVariable int id) {
        serviceUsuario.delete(id);
    }
}
