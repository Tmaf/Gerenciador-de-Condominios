package model.dao.crud;

import model.dao.CrudDao;
import model.domain.Reclamacao;

public interface ReclamacaoDao extends CrudDao<Reclamacao,Integer>{
	
	static final String NOME_SERVICO = "ServicoReclamacao";
	static final String URL_SERVICO = "rmi://127.0.0.1/" + NOME_SERVICO;
}
