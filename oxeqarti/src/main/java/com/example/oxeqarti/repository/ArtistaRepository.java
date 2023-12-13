package com.example.oxeqarti.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oxeqarti.model.Artista;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, Long> {
    Optional<Artista> findByNomeArtista(String nomeArtista);
}
