package com.example.oxeqarti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.oxeqarti.model.Arte;
import com.example.oxeqarti.service.ArteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/artes")
public class ArteController {

    @Autowired
    private ArteService arteService;

    @PostMapping
    public ResponseEntity<Arte> salvarArte(@RequestBody Arte arte) {
        Arte arteSalva = arteService.salvarArte(arte);
        return ResponseEntity.ok(arteSalva);
    }

    @GetMapping("/{titulo}")
    public ResponseEntity<?> encontrarArtePorTitulo(@PathVariable String titulo) {
        Optional<Arte> optionalArte = arteService.encontrarArtePorTitulo(titulo);

        if (optionalArte.isPresent()) {
            Arte arte = optionalArte.get();
            return ResponseEntity.ok(arte);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Arte>> encontrarTodasAsArtes() {
        List<Arte> artes = arteService.encontrarTodasAsArtes();
        return ResponseEntity.ok(artes);
    }

    // Métodos adicionais para tratamento de exceções podem ser incluídos aqui
}
