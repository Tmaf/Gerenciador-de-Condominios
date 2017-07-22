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

import org.omg.CORBA.portable.RemarshalException;

/**
 *
 * @author tarci
 * @param <E>
 * @param <I>
 */
public interface CrudDao <E extends Serializable, I> extends Remote{
	
	

    void excluir(E classeModelo) throws RemoteException;
    List pesquisar(E classeModelo) throws RemoteException;
    void salvar(E classeModelo) throws RemoteException;
    
}
