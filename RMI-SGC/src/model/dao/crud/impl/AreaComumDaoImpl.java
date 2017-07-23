package model.dao.crud.impl;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import model.dao.CrudDaoImpl;
import model.dao.crud.AreaComumDao;
import model.domain.AreaComum;

public class AreaComumDaoImpl extends CrudDaoImpl<AreaComum, String> implements AreaComumDao {

	private static final long serialVersionUID = 1L;

	public AreaComumDaoImpl() throws RemoteException {
	}

	@Override
	protected String getChave(AreaComum modelo) {
		return modelo.getNome();
	}

	@Override
	protected String getConsultaSql(AreaComum modelo) {
		StringBuffer sql = new StringBuffer("from AreaComum where " + "1=1");
		if (modelo.getValor() < 0) {
			sql.append(" and valor like :valor ");
		}
		if (modelo.getNome() != null && !modelo.getNome().equals("")) {
			sql.append("and nome like :nome ");
		}
		if (modelo.getPessoa().getCpf() != null && !modelo.getPessoa().getCpf().equals("")) {
			sql.append("and pessoa like :pessoa ");
		}
		if (modelo.getDataReserva() != null) {
			sql.append("and dataReserva like :dataReserva");
		}
		if (modelo.getHoraInicio() != null) {
			sql.append("and horaInicio like :horaInicio");
		}
		if (modelo.getHoraFim() != null) {
			sql.append("and horaFim like :horaFim");
		}
		return sql.toString();
	}

	@Override
	protected Map<String, Object> getParametrosMapa(AreaComum modelo) {
		Map<String, Object> mapa = new HashMap<>();

		if (modelo.getValor() < 0) {
			mapa.put("valor", modelo.getValor());
		}
		if (modelo.getNome() != null && !modelo.getNome().equals("")) {
			mapa.put("nome", modelo.getNome());
		}
		if (modelo.getPessoa().getCpf() != null && !modelo.getPessoa().getCpf().equals("")) {
			mapa.put("morador", modelo.getPessoa());
		}
		if (modelo.getDataReserva() != null) {
			mapa.put("dataReserva", modelo.getDataReserva());
		}
		if (modelo.getHoraInicio() != null) {
			mapa.put("horaInicio", modelo.getHoraInicio());
		}
		if (modelo.getHoraFim() != null) {
			mapa.put("horaFim", modelo.getHoraFim());
		}

		return mapa;
	}
}
