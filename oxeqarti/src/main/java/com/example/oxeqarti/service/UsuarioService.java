package com.example.oxeqarti.service;

import com.example.oxeqarti.model.Usuario;

public interface UsuarioService {
    Usuario salvarUsuario(Usuario usuario);
    Usuario encontrarUsuarioPorEmail(String email);
    Usuario encontrarUsuarioPorId(Long idUsuario);
}
