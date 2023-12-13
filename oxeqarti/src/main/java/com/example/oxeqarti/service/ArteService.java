package com.example.oxeqarti.service;

import com.example.oxeqarti.model.Arte;

import java.util.List;
import java.util.Optional;

public interface ArteService {
    Arte salvarArte(Arte arte);
    Optional<Arte> encontrarArtePorTitulo(String titulo);
    List<Arte> encontrarTodasAsArtes();
}
