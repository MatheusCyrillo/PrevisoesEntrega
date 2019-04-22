package br.usjt.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.springboot.model.Usuario;
import br.usjt.springboot.model.repository.UsuarioRepository;

@Service
public class LoginService {
	
	@Autowired
	private UsuarioRepository repo;
	
	public boolean logar(Usuario usuario) {
		return repo.findOneByUserAndPass(usuario.getUser(), usuario.getPass()) != null;
	}
	
}