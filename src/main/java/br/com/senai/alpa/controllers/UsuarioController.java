package br.com.senai.alpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.senai.alpa.model.Usuario;
import br.com.senai.alpa.services.UsuarioService;


@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("registrar")
	public String registrar() {
		return "registrar";
	}
	
	@RequestMapping("main")
	public String main() {
		return "main";
	}
	
	@RequestMapping("ranking")
	public String Ranking(Model model) {
		
		Iterable<Usuario> usuarios = service.obterTodosUsuarios();
		model.addAttribute("usuarios",usuarios);
		
		
		return "ranking";
	}
	
	
	
		
	@RequestMapping(value="insere", method=RequestMethod.POST)
	public String Inserir
	(@RequestParam("nomeusuario")String usuario, @RequestParam("senha")String senha,@RequestParam("nick")
	String nick,@RequestParam("email") String email,@RequestParam("level") Integer level) {
		
		Usuario user = new Usuario(usuario,senha,nick,email,level);
		service.inserir(user);
		
		return "login";
		
	}
	
	
	@RequestMapping(value="logar", method=RequestMethod.POST)
	public String logar(Usuario usuario) {
		
		if(service.obterUsuario(usuario) == null) {
			return "login";
		}
		else {
			return "main";
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
}
