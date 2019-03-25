package br.com.senai.alpa.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.alpa.model.Usuario;
import br.com.senai.alpa.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	
	// Salva o Usuario no banco de dados.
	public void inserir(Usuario usuario) {
		 repository.save(usuario);
	}
	
	// Procura pelo usuario no banco de dados e retorna ele
	public Usuario obterUsuario(Usuario usuario){
	
		return repository.findByNomeusuarioAndSenha(usuario.getNomeusuario(), usuario.getSenha());
	}
	
	// retorna todos os usuarios no banco de dados
	public Iterable<Usuario> obterTodosUsuarios(){
		
		Iterable<Usuario> usuarios = repository.findAll();
				
		return usuarios;
	}
	
	
	 
	
}
