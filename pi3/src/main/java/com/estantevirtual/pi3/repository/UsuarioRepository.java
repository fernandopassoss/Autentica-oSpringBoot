package com.estantevirtual.pi3.repository;

import com.estantevirtual.pi3.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
    UserDetails findByEmail(String email);
}
