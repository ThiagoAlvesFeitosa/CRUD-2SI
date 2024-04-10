package com.example.tabacaria2si.dominio.pessoa.controller;


import com.example.tabacaria2si.dominio.pessoa.entity.Usuario;
import com.example.tabacaria2si.dominio.pessoa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired //injecao da dependencia
    UsuarioRepository repo;

    @GetMapping
    public ResponseEntity<Collection<Usuario>> findAll(){
        List<Usuario> usuarios = repo.findAll();
        return ResponseEntity.ok(usuarios);
    }


}
