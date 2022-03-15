package com.atsistemas.formacion.base.jpa.libros.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.formacion.base.jpa.libros.model.Usuario;
import com.atsistemas.formacion.base.jpa.libros.service.UsuarioService;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

	private UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> listarAutores() {
		return usuarioService.listadoUsuarios();
	}

}
