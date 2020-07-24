package com.physicalsoftware.usuarios_example.service;

import com.physicalsoftware.usuarios_example.entity.Usuarios;

import java.util.List;

public interface UsuariosService {

    List<Usuarios> listarUsuarios();

    Usuarios obtenerUsuarioPorCorreo(String email);
}
