/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.FuncionarioControl;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import model.domain.pessoas.Funcionario;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class FuncionarioControlImpl extends ControlImpl<Funcionario> implements FuncionarioControl{

    public FuncionarioControlImpl() throws RemoteException, NotBoundException, MalformedURLException {
    }

    
    @Override
    protected Class getClasse() {
        return Funcionario.class;
    }
}