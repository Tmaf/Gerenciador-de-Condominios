package model.dao.crud.impl;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import model.dao.CrudDaoImpl;
import model.dao.crud.EmpresaDao;
import model.domain.Empresa;

public class EmpresaDaoImpl extends CrudDaoImpl<Empresa, String> implements EmpresaDao {

	private static final long serialVersionUID = 1L;

	public EmpresaDaoImpl() throws RemoteException {
	}

	@Override
	protected String getChave(Empresa modelo) {
		return modelo.getCnpj();
	}

	@Override
	protected String getConsultaSql(Empresa modelo) {

		StringBuffer sql = new StringBuffer("from Empresa where " + "1=1");
		if (modelo.getCnpj() != null && !modelo.getCnpj().equals("")) {
			sql.append(" and cnpj like :cnpj ");
		}
		if (modelo.getNome() != null && !modelo.getNome().equals("")) {
			sql.append("and nome like :nome ");
		}
		if (modelo.getTelefone() != null && !modelo.getTelefone().equals("")) {
			sql.append("and telefone like :telefone ");
		}
		if (modelo.getEmail() != null && !modelo.getEmail().equals("")) {
			sql.append("and email like :email ");
		}
		if (modelo.getServico() != null && !modelo.getServico().equals("")) {
			sql.append("and servico like :servico ");
		}

		return sql.toString();

	}

	@Override
	protected Map<String, Object> getParametrosMapa(Empresa modelo) {

		Map<String, Object> mapa = new HashMap<>();
		if (modelo.getCnpj() != null && !modelo.getCnpj().equals("")) {
			mapa.put("cnpj", modelo.getCnpj());
		}
		if (modelo.getNome() != null && !modelo.getNome().equals("")) {
			mapa.put("nome", modelo.getNome());
		}
		if (modelo.getServico() != null && !modelo.getServico().equals("")) {
			mapa.put("servico", modelo.getServico());
		}
		if (modelo.getEmail() != null && !modelo.getEmail().equals("")) {
			mapa.put("email", modelo.getEmail());
		}
		if (modelo.getTelefone() != null && !modelo.getTelefone().equals("")) {
			mapa.put("telefone", modelo.getTelefone());
		}
		return mapa;
	}

}
