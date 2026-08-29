package com.crud.cadastro_usuario.infrastructure.repository;

import com.crud.cadastro_usuario.infrastructure.entityes.Usuario;

import java.util.Optional;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
