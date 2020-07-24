package com.physicalsoftware.usuarios_example.service.imp;


import com.physicalsoftware.usuarios_example.entity.Usuarios;
import com.physicalsoftware.usuarios_example.repository.UsuariosRepository;
import com.physicalsoftware.usuarios_example.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosServiceImp implements UsuariosService {
    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public List<Usuarios> listarUsuarios() {
        return (List<Usuarios>) usuariosRepository.findAll();
    }

    @Override
    public Usuarios obtenerUsuarioPorCorreo(String email) {
        return usuariosRepository.findByEmail(email);
    }
}
