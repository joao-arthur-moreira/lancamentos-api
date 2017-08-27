package com.jajm.lancamentosapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jajm.lancamentosapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByEmail(String email);
	
}
