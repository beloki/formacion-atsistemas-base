package com.atsistemas.formacion.base.jpa.bootspringdata.service.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Pelicula;
import com.atsistemas.formacion.base.jpa.bootspringdata.repository.PeliculaRepository;
import com.atsistemas.formacion.base.jpa.bootspringdata.service.PeliculaService;

@Service
public class PeliculaServiceImpl implements PeliculaService {

	private PeliculaRepository peliculaRepository;

	public PeliculaServiceImpl(PeliculaRepository peliculaRepository) {
		this.peliculaRepository = peliculaRepository;
	}

	@Override
	public List<Pelicula> listarPeliculas() {
		return peliculaRepository.findAll();
	}

	@Override
	public Pelicula buscarPelicula(Integer id) {
		return peliculaRepository.findById(id).get();
	}

	@Override
	@Transactional
	public Pelicula guardarPelicula(Pelicula pelicula) {
		return peliculaRepository.save(pelicula);
	}

	@Override
	@Transactional
	public void eliminarPelicula(Integer idPelicula) {
		peliculaRepository.deleteById(idPelicula);
	}

	@Override
	public List<Pelicula> buscarPeliculaGenero(String genero) {
		return peliculaRepository.findByGenero(genero);
	}

	@Override
	public List<Pelicula> buscarPeliculaFechaEstreno(Integer fecha) {
		return peliculaRepository.findByFechaEstrenoGreaterThan(fecha);
	}

	@Override
	public List<Pelicula> buscarPeliculasSiglo21() {
		return peliculaRepository.findBy21thCentury();
	}

	@Override
//	public List<Pelicula> buscarPeliculas(FiltrosPelicula filtros) {
	public List<Pelicula> buscarPeliculas(String titulo, String director, Integer fechaEstreno, String genero) {
		Specification<Pelicula> spec = Specification.where(null);

		if (titulo != null) {
			Specification<Pelicula> tituloSpec = filtroTitulo(titulo);
			spec = spec.and(tituloSpec);
		}

		if (genero != null) {
			Specification<Pelicula> generoSpec = filtroGenero(genero);
			spec = spec.and(generoSpec);
		}

		if (fechaEstreno != null) {
			Specification<Pelicula> fechaEstrenoSpec = filtroFechaEstreno(fechaEstreno);
			spec = spec.and(fechaEstrenoSpec);
		}

		return peliculaRepository.findAll(spec);
	}

	private Specification<Pelicula> filtroFechaEstreno(Integer fechaEstreno) {
		Specification<Pelicula> fechaEstrenoSpec = (Root<Pelicula> root, CriteriaQuery<?> query,
				CriteriaBuilder criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("fechaEstreno"), fechaEstreno);
		return fechaEstrenoSpec;
	}

	private Specification<Pelicula> filtroGenero(String genero) {
		Specification<Pelicula> generoSpec = (Root<Pelicula> root, CriteriaQuery<?> query,
				CriteriaBuilder criteriaBuilder) -> criteriaBuilder.equal(root.get("genero"), genero);
		return generoSpec;
	}

	private Specification<Pelicula> filtroTitulo(String titulo) {
		return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("titulo"), "%" + titulo + "%");
	}

}
