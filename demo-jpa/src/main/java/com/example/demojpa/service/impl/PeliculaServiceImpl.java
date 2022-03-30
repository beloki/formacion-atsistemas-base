package com.example.demojpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demojpa.model.Pelicula;
import com.example.demojpa.repository.PeliculaRepository;
import com.example.demojpa.service.PeliculaService;

@Service
public class PeliculaServiceImpl implements PeliculaService {

	@Autowired
	private PeliculaRepository peliculaRepository;

	@Override
	public List<Pelicula> listarPeliculas() {
		return peliculaRepository.findAll();
	}
	
	@Override
	public Pelicula obtenerPelicula(Integer id) {
		return peliculaRepository.findById(id).get();
	}
	
	@Override
	public Pelicula guardar(Pelicula pelicula) {
		return peliculaRepository.save(pelicula);
	}
	
	@Override
	public List<Pelicula> buscarPorGenero(String genero){
		return peliculaRepository.findByGenero(genero);
	}
	
	@Override
	public List<Pelicula> buscarSiglo21(){
		return peliculaRepository.findBy21thCentury();
	}
	
	@Override
	public List<Pelicula> buscarPorFechaEstreno(Integer fechaEstreno){
		return peliculaRepository.findByFechaEstrenoGreaterThan(fechaEstreno);
	}

}
