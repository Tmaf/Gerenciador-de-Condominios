package model.dao.crud;

import model.dao.CrudDao;
import model.domain.pessoas.Morador;

public interface MoradorDao extends CrudDao<Morador, String> {

	static final String NOME_SERVICO = "ServicoMorador";
	static final String URL_SERVICO = "rmi://127.0.0.1/" + NOME_SERVICO;
}
