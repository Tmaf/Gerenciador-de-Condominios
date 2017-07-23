package model.dao.crud;

import model.dao.CrudDao;
import model.domain.pessoas.Funcionario;

public interface FuncionarioDao extends CrudDao<Funcionario, String> {

	static final String NOME_SERVICO = "ServicoFuncionario";
	static final String URL_SERVICO = "rmi://127.0.0.1/" + NOME_SERVICO;

}
