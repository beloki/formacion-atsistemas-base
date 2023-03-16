package com.atsistemas.formacion.base.jpa.bootspringdata.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Usuario;
import com.atsistemas.formacion.base.jpa.bootspringdata.repository.UsuarioRepository;
import com.atsistemas.formacion.base.jpa.bootspringdata.service.UsuarioService;

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
