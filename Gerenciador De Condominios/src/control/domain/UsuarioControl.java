/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain;

import model.domain.pessoas.Usuario;

/**
 *
 * @author Tarcísio M. Almeida
 */
public interface UsuarioControl extends Control<Usuario> {
    public Usuario login(Usuario e);
}
