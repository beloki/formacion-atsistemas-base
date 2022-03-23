package com.atsistemas.formacion.base.jpa.libros.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.jpa.libros.model.Usuario;
import com.atsistemas.formacion.base.jpa.libros.service.UsuarioService;
import com.atsistemas.formacion.base.jpa.libros.service.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioRepository usuarioRepository;

	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public List<Usuario> listadoUsuarios() {
		return usuarioRepository.findAll();
	}

}
