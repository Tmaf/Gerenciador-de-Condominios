/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.EncomendaControl;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import model.domain.Encomenda;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class EncomendaControlImpl extends ControlImpl<Encomenda> implements EncomendaControl{

    public EncomendaControlImpl() throws RemoteException, NotBoundException, MalformedURLException {
    }
    
    

    @Override
    protected Class getClasse() {
        return Encomenda.class;
    }
    
    
}
