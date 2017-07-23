package model.dao.crud;

import model.dao.CrudDao;
import model.domain.AreaComum;

public interface AreaComumDao extends CrudDao<AreaComum, String> {

	static final String NOME_SERVICO = "ServicoAreaComum";
	static final String URL_SERVICO = "rmi://127.0.0.1/" + NOME_SERVICO;

}
