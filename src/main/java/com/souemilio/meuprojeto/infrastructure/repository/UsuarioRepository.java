package com.souemilio.meuprojeto.infrastructure.repository;

import com.souemilio.meuprojeto.infrastructure.entity.Usuario;
import org.hibernate.internal.util.GenericsHelper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    boolean existsByEmail(String email);


    Optional<Usuario> findByEmail(String email);
}
