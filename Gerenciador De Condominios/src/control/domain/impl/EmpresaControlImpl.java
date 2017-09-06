/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.EmpresaControl;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import model.domain.Empresa;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class EmpresaControlImpl extends ControlImpl<Empresa> implements EmpresaControl{

    public EmpresaControlImpl() throws RemoteException, NotBoundException, MalformedURLException {
    }
    
    

    @Override
    protected Class getClasse() {
       return Empresa.class;
    }
    
    
    
}
