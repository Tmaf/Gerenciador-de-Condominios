/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.Control;
import model.domain.pessoas.Usuario;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class UsuarioControlImpl  extends Control<Usuario>{

    @Override
    protected Class getClasse() {
        return Usuario.class;
    }
    
    public Usuario buscarPorChave(Usuario e){
        Usuario user=super.bucarPorChave(e);
        
        if(user!=null && user.getSenha().equals(e.getSenha()))
            return user;
        else return null;
    
    }
    
    
}