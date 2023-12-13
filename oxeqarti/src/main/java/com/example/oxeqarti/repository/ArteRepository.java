package com.example.oxeqarti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oxeqarti.model.Arte;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArteRepository extends JpaRepository<Arte, Long> {
    List<Arte> findByCategoria(String categoria);

    Optional<Arte> findByTitulo(String titulo);
}
