package com.atsistemas.formacion.base.jpa.bootspringdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Integer>, JpaSpecificationExecutor<Pelicula> {

//	@Query(value = "FROM Pelicula where genero = :genero")
	List<Pelicula> findByGenero(String genero);

	List<Pelicula> findByFechaEstrenoGreaterThan(Integer fecha);

	@Query(value = "SELECT * FROM pelicula p WHERE p.fecha_estreno >= 2000", nativeQuery = true)
	public List<Pelicula> findBy21thCentury();

}
