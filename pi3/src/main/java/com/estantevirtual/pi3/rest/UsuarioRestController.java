package com.estantevirtual.pi3.rest;

import com.estantevirtual.pi3.model.UsuarioModel;
import com.estantevirtual.pi3.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class UsuarioRestController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    Iterable<UsuarioModel> getUsuarios(){
        return usuarioRepository.findAll();
    }
}
