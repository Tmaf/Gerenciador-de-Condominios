package model.dao.crud;

import model.dao.CrudDao;
import model.domain.Encomenda;

public interface EncomendaDao extends CrudDao<Encomenda, String> {

	static final String NOME_SERVICO = "ServicoEncomenda";
	static final String URL_SERVICO = "rmi://127.0.0.1/" + NOME_SERVICO;

}
