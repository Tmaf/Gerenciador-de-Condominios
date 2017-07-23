/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author tarci
 * @param <E>
 * @param <I>
 */
public interface CrudDao <E extends Serializable, I> extends Remote{
	
    public abstract void excluir(E classeModelo) throws RemoteException;
    public abstract List<E> pesquisar(E classeModelo) throws RemoteException;
    public abstract void salvar(E classeModelo) throws RemoteException;
    
}
