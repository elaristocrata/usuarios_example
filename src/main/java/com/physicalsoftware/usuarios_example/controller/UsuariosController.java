package com.physicalsoftware.usuarios_example.controller;

import com.physicalsoftware.usuarios_example.entity.Usuarios;
import com.physicalsoftware.usuarios_example.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("/listar_usuarios")
    public @ResponseBody
    List<Usuarios> listarUsuarios() {

        return usuariosService.listarUsuarios();
    }



}
