/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.UsuarioControl;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import model.domain.pessoas.Usuario;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class UsuarioControlImpl  extends ControlImpl<Usuario> implements UsuarioControl{

    public UsuarioControlImpl() throws RemoteException, NotBoundException, MalformedURLException {
    }

    
    @Override
    protected Class getClasse() {
        return Usuario.class;
    }
    
    @Override
    public Usuario login(Usuario e){
        Usuario user=super.bucarPorChave(e);
        
        if(user!=null && user.getSenha().equals(e.getSenha()))
            return user;
        else return null;
    
    }
    
    
}