/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.ReservaControl;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import model.domain.Reserva;

/**
 *
 * @author Aline
 */
public class ReservaControlImpl extends ControlImpl<Reserva> implements ReservaControl{

    public ReservaControlImpl() throws RemoteException, NotBoundException, MalformedURLException {
    }

    
    @Override
    protected Class getClasse() {
        return Reserva.class;
    }
    
}
