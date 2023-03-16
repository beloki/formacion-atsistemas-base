package com.atsistemas.formacion.base.jpa.bootspringdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.atsistemas.formacion.base.jpa.bootspringdata.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

	@Query("FROM Libro l JOIN FETCH l.autor")
	List<Libro> findAllJoin();

	List<Libro> findByTituloLike(String titulo);

//	@Query("FROM Libro l where l.autor.nombre like ?1")
//	@EntityGraph(attributePaths = "autor")
	List<Libro> findByAutorNombreContains(String nombre);

	@Query("FROM Libro l JOIN FETCH l.autor a where a.nombre like %?1%")
	List<Libro> findByAutorJoinFetch(String nombre);

}
