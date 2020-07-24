package com.physicalsoftware.usuarios_example.repository;

import com.physicalsoftware.usuarios_example.entity.Usuarios;
import org.springframework.data.repository.CrudRepository;

public interface UsuariosRepository extends CrudRepository<Usuarios, Long> {

    Usuarios findByEmail(String email);
}
