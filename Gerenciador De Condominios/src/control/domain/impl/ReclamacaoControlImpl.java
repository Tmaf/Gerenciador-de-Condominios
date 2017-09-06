/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.ReclamacaoControl;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import model.domain.Reclamacao;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class ReclamacaoControlImpl  extends ControlImpl<Reclamacao> implements ReclamacaoControl{

    public ReclamacaoControlImpl() throws RemoteException, NotBoundException, MalformedURLException {
    }

    
    @Override
    protected Class getClasse() {
        return Reclamacao.class;
    }
    
    
}