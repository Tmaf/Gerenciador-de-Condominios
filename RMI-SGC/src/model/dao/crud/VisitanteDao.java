package model.dao.crud;

import model.dao.CrudDao;
import model.domain.pessoas.Visitante;

public interface VisitanteDao extends CrudDao<Visitante, String> {

	static final String NOME_SERVICO = "ServicoVisitante";
	static final String URL_SERVICO = "rmi://127.0.0.1/" + NOME_SERVICO;

}
