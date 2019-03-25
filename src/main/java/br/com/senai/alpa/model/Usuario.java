package br.com.senai.alpa.model;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nomeusuario", nullable=false, unique=true)
	private String nomeusuario;
	
	@Column(name="senha", nullable=false, unique=false)
    private String senha;
	
    @Column(name="ultimoAcesso")
    private LocalDate ultimoAcesso;
    
    @Column(name="nick", unique=true)
    private String nickName;
    
    @Column(name="level")
    private Integer level;
    
    @Column(name="email")
    private String email;

    // Constructors
    public Usuario() {
    	
    }
    
    public Usuario(String user,String password) {
    	this.nomeusuario = user;
    	this.senha = password;
    }
    
    public Usuario(String nomeUsuario, String senha, String nickName, String email, Integer level) {
		super();
		this.nomeusuario = nomeUsuario;
		this.senha = senha;
		this.nickName = nickName;
		this.level = level;
		this.email = email;
		this.ultimoAcesso = java.time.LocalDate.now();
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public String getNomeusuario() {
		return nomeusuario;
	}

	public void setNomeusuario(String nomeusuario) {
		this.nomeusuario = nomeusuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getUltimoAcesso() {
		return ultimoAcesso;
	}

	public void setUltimoAcesso(LocalDate ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	

    
    
    
    
    
    
    
	

}
