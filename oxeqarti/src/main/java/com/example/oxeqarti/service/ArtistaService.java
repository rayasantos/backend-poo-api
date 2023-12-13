package com.example.oxeqarti.service;

import com.example.oxeqarti.model.Artista;

import java.util.List;
import java.util.Optional;

public interface ArtistaService {
    Artista salvarArtista(Artista artista);
    Optional<Artista> encontrarArtistaPorNome(String nomeArtista);
    List<Artista> encontrarTodosOsArtistas();
}
