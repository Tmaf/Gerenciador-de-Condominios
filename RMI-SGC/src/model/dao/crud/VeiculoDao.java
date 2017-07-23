package model.dao.crud;

import model.dao.CrudDao;
import model.domain.Veiculo;

public interface VeiculoDao extends CrudDao<Veiculo, String> {

	static final String NOME_SERVICO = "ServicoVeiculo";
	static final String URL_SERVICO = "rmi://127.0.0.1/" + NOME_SERVICO;

}
