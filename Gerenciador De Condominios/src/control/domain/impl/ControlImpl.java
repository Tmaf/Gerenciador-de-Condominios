/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.Control;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dao.CrudDao;
import model.service.ServiceClient;
import model.service.ServiceInterface;

/**
 *
 * @author Tarcísio M. Almeida
 * @param <E> Classe do dominio
 */
public abstract class ControlImpl<E extends Serializable> implements Control<E> {

    private final CrudDao dao;
    private static ControlImpl control;
    private List<E> buffer;

    public ControlImpl() throws RemoteException, NotBoundException, MalformedURLException {
        buffer = new ArrayList<>();
        ServiceInterface service;
        service = ServiceClient.getServiceLocator();
        Class c = this.getClasse();
        System.out.println(c);
        dao = service.getService(c);
    }

    @Override
    public void salvar(E e) {
        try {
            dao.salvar(e);
        } catch (RemoteException ex) {
            Logger.getLogger(ControlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public E bucarPorChave(E e) {

        try {
            List<E> l = dao.pesquisar(e);
            if (l.size() == 1) {
                return l.get(0);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(ControlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void excluir(E e) {
        try {
            dao.excluir(e);
        } catch (RemoteException ex) {
            Logger.getLogger(ControlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String[] pesquisar(E e) {

        try {
            buffer = dao.pesquisar(e);
        } catch (RemoteException ex) {
            Logger.getLogger(ControlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        String[] retorno = new String[buffer.size()];

        for (int i = 0; i < buffer.size(); i++) {

            retorno[i] = buffer.get(i).toString();
        }
        return retorno;
    }

    @Override
    public E getBufferIndex(int i) {
        return buffer.get(i);
    }

    protected abstract Class getClasse() throws RemoteException;

}
