package com.example.oxeqarti.service;

import com.example.oxeqarti.model.Usuario;
import com.example.oxeqarti.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario encontrarUsuarioPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    @Override
    public Usuario encontrarUsuarioPorId(Long idUsuario) {
        throw new UnsupportedOperationException("Unimplemented method 'encontrarUsuarioPorId'");
    }
}
