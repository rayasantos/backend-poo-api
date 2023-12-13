package com.example.oxeqarti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.oxeqarti.model.Artista;
import com.example.oxeqarti.service.ArtistaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    @Autowired
    private ArtistaService artistaService;

    @PostMapping
    public ResponseEntity<Artista> salvarArtista(@RequestBody Artista artista) {
        Artista artistaSalvo = artistaService.salvarArtista(artista);
        return ResponseEntity.ok(artistaSalvo);
    }

    @GetMapping("/{nomeArtista}")
    public ResponseEntity<?> encontrarArtistaPorNome(@PathVariable String nomeArtista) {
        Optional<Artista> optionalArtista = artistaService.encontrarArtistaPorNome(nomeArtista);

        if (optionalArtista.isPresent()) {
            Artista artista = optionalArtista.get();
            return ResponseEntity.ok(artista);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Artista>> encontrarTodosOsArtistas() {
        List<Artista> artistas = artistaService.encontrarTodosOsArtistas();
        return ResponseEntity.ok(artistas);
    }
}
