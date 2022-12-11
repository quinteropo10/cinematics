package com.bezkoder.spring.jpa.postgresql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.jpa.postgresql.model.Pelicula;

public interface TutorialRepository extends JpaRepository<Pelicula, Long> {
  List<Pelicula> findByPublished(boolean published);

  List<Pelicula> findByTitleContaining(String title);
}
