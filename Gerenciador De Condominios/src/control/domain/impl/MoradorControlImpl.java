/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.MoradorControl;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import model.domain.pessoas.Morador;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class MoradorControlImpl  extends ControlImpl<Morador> implements MoradorControl{

    public MoradorControlImpl() throws RemoteException, NotBoundException, MalformedURLException {
    }

    
    @Override
    protected Class getClasse() {
        return Morador.class;
    }
    
    
}