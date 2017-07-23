package model.dao.crud;

import model.dao.CrudDao;
import model.domain.Empresa;

public interface EmpresaDao extends CrudDao<Empresa, String> {

	static final String NOME_SERVICO = "ServicoEmpresa";
	static final String URL_SERVICO = "rmi://127.0.0.1/" + NOME_SERVICO;

}
