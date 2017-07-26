package model.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import model.dao.CrudDao;

public interface ServiceInterface extends Remote{
	
	static final String NOME_SERVICO = "ServicoCrud";
	static final String URL_SERVICO = "rmi://127.0.0.1/" + NOME_SERVICO;

    CrudDao getService(Class dominio) throws RemoteException;
    Class getClasse(Class dominio) throws RemoteException;
}
