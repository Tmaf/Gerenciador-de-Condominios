/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.FinanceiroControl;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import model.domain.Financeiro;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class FinanceiroControlImpl extends ControlImpl<Financeiro> implements FinanceiroControl{

    public FinanceiroControlImpl() throws RemoteException, NotBoundException, MalformedURLException {
    }

    
    @Override
    protected Class getClasse() {
        return Financeiro.class;
    }
    
}
