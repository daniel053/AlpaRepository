package br.com.senai.alpa.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.senai.alpa.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	Usuario findByNomeusuarioAndSenha(String nomeusuario, String senha);
}
