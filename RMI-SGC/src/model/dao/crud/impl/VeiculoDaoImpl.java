package model.dao.crud.impl;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import model.dao.CrudDaoImpl;
import model.dao.crud.VeiculoDao;
import model.domain.Veiculo;

public class VeiculoDaoImpl extends CrudDaoImpl<Veiculo, String> implements VeiculoDao {

	private static final long serialVersionUID = 1L;

	public VeiculoDaoImpl() throws RemoteException {
	}

	@Override
	protected String getChave(Veiculo modelo) {
		return modelo.getPlaca();
	}

	@Override
	protected String getConsultaSql(Veiculo modelo) {
		StringBuffer sql = new StringBuffer("from Veiculo where " + "1=1");
		if (modelo.getPlaca() != null && !modelo.getPlaca().equals("")) {
			sql.append("and placa like :placa ");
		}
		if (modelo.getModelo() != null && !modelo.getModelo().equals("")) {
			sql.append("and modelo like :modelo ");
		}

		return sql.toString();
	}

	@Override
	protected Map<String, Object> getParametrosMapa(Veiculo modelo) {

		Map<String, Object> mapa = new HashMap<>();

		if (modelo.getPlaca() != null && !modelo.getPlaca().equals("")) {
			mapa.put("placa", modelo.getPlaca());
		}

		if (modelo.getModelo() != null && !modelo.getModelo().equals("")) {
			mapa.put("modelo", modelo.getModelo());
		}
		return mapa;
	}

}
