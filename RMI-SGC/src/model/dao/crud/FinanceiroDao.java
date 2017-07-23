package model.dao.crud;

import model.dao.CrudDao;
import model.domain.Financeiro;

public interface FinanceiroDao extends CrudDao<Financeiro, String> {

	static final String NOME_SERVICO = "ServicoFinanceiro";
	static final String URL_SERVICO = "rmi://127.0.0.1/" + NOME_SERVICO;

}
