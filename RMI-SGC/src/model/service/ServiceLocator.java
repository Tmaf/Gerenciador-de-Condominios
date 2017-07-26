package model.service;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

import model.dao.CrudDao;
import model.dao.crud.impl.AreaComumDaoImpl;
import model.dao.crud.impl.EmpresaDaoImpl;
import model.dao.crud.impl.EncomendaDaoImpl;
import model.dao.crud.impl.FinanceiroDaoImpl;
import model.dao.crud.impl.FuncionarioDaoImpl;
import model.dao.crud.impl.MoradorDaoImpl;
import model.dao.crud.impl.ReclamacaoDaoImpl;
import model.dao.crud.impl.ReservaDaoImpl;
import model.dao.crud.impl.UsuarioDaoImpl;
import model.dao.crud.impl.VeiculoDaoImpl;
import model.dao.crud.impl.VisitanteDaoImpl;
import model.domain.AreaComum;
import model.domain.Empresa;
import model.domain.Encomenda;
import model.domain.Financeiro;
import model.domain.Reclamacao;
import model.domain.Reserva;
import model.domain.Veiculo;
import model.domain.pessoas.Funcionario;
import model.domain.pessoas.Morador;
import model.domain.pessoas.Usuario;
import model.domain.pessoas.Visitante;

public class ServiceLocator extends UnicastRemoteObject implements ServiceInterface, Serializable {

	private static final long serialVersionUID = 1L;
	private Map<Class, Class> map;
	private static ServiceLocator serviceLocator;

	private ServiceLocator() throws RemoteException {
		map = new HashMap<>();
	}

	public static ServiceInterface getServiceLocator() throws RemoteException {
		if (serviceLocator == null)
			serviceLocator = new ServiceLocator();
		return serviceLocator;
	}

	@Override
	public CrudDao getService(Class dominio) {
		CrudDao crud;
		try {
			if (map.size() == 0)
				this.initAntigo();
			System.out.println("" + map.size() + "\n" + map.get(dominio));

			crud = (CrudDao) (map.get(dominio).newInstance());
		} catch (IllegalAccessException | InstantiationException e) {
			crud = null;
		}
		return crud;
	}
	
	public Class getClasse(Class dominio){
		return dominio.getClass();
	}

	public void addService(Class dominio, Class cruddao) {
		map.put(dominio, cruddao);
	}

	private void initAntigo() {
		map.put(Morador.class, MoradorDaoImpl.class);
		map.put(AreaComum.class, AreaComumDaoImpl.class);
		map.put(Empresa.class, EmpresaDaoImpl.class);
		map.put(Encomenda.class, EncomendaDaoImpl.class);
		map.put(Funcionario.class, FuncionarioDaoImpl.class);
		map.put(Financeiro.class, FinanceiroDaoImpl.class);
		map.put(Reclamacao.class, ReclamacaoDaoImpl.class);
		map.put(Usuario.class, UsuarioDaoImpl.class);
		map.put(Veiculo.class, VeiculoDaoImpl.class);
		map.put(Visitante.class, VisitanteDaoImpl.class);
		map.put(Reserva.class, ReservaDaoImpl.class);
	}

}
