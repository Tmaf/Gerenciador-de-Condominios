package model.dao.crud;

import model.dao.CrudDao;
import model.domain.pessoas.Usuario;

public interface UsuarioDao extends CrudDao <Usuario,String>{
	
	static final String NOME_SERVICO = "ServicoUsuario";
	static final String URL_SERVICO = "rmi://127.0.0.1/" + NOME_SERVICO;
    
}
