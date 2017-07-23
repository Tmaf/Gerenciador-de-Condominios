package model.dao.crud.impl;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import model.dao.CrudDaoImpl;
import model.dao.crud.ReclamacaoDao;
import model.domain.Reclamacao;

public class ReclamacaoDaoImpl extends CrudDaoImpl<Reclamacao, Integer> implements ReclamacaoDao {

	private static final long serialVersionUID = 1L;

	public ReclamacaoDaoImpl() throws RemoteException {
	}

	@Override
	protected Integer getChave(Reclamacao modelo) {
		return modelo.getCodigo();
	}

	@Override
	protected String getConsultaSql(Reclamacao modelo) {

		StringBuffer sql = new StringBuffer("from Reclamacao where " + "1=1");
		if (modelo.getAssunto() != null && !modelo.getAssunto().equals("")) {
			sql.append("and assunto like :assunto ");
		}
		if (modelo.getRespostaSindico() != null && !modelo.getRespostaSindico().equals("")) {
			sql.append("and respostaSindico like :respostaSindico ");
		}
		if (modelo.getTexto() != null && !modelo.getTexto().equals("")) {
			sql.append(" and texto like :texto ");
		}
		if (modelo.getCodigo() >= 0) {
			sql.append(" and codigo = :codigo ");
		}
		return sql.toString();
	}

	@Override
	protected Map<String, Object> getParametrosMapa(Reclamacao modelo) {

		Map<String, Object> mapa = new HashMap<>();

		if (modelo.getAssunto() != null && !modelo.getAssunto().equals("")) {

			mapa.put("assunto", modelo.getAssunto());
		}
		if (modelo.getRespostaSindico() != null && !modelo.getRespostaSindico().equals("")) {
			mapa.put("respostaSindico", modelo.getRespostaSindico());
		}
		if (modelo.getTexto() != null && !modelo.getTexto().equals("")) {
			mapa.put("texto", modelo.getTexto());
		}
		if (modelo.getCodigo() >= 0) {
			mapa.put("codigo", modelo.getCodigo());
		}

		return mapa;
	}

}