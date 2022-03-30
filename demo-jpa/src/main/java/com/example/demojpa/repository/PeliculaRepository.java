package com.example.demojpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demojpa.model.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {

	@Query(value = "FROM Pelicula p WHERE p.genero = :genero")
	public List<Pelicula> findByGenero(@Param(value = "genero") String genero);

	@Query(value = "SELECT * FROM pelicula p WHERE p.fecha_estreno >= 2000", nativeQuery = true)
	public List<Pelicula> findBy21thCentury();

	public List<Pelicula> findByFechaEstrenoGreaterThan(Integer fechaEstreno);

}
