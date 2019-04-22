package br.usjt.springboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.springboot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findOneByUserAndPass(String user, String pass);
	
}