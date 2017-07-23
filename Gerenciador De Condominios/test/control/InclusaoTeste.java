/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.domain.Control;
import control.domain.ControlFactory;
import model.domain.pessoas.Usuario;
/**
 *
 * @author Tarcísio M. Almeida
 */
public class InclusaoTeste {
    
    public static void main(String[] args) {
        Usuario user = new Usuario();
        
        user.setCpf("12345");
        user.setNome("Administrador");
        user.setPermissao("Sindico");
        user.setSenha("12345");
        Control c = ControlFactory.getUsuarioControl();
        
        c.salvar(user);
    }
}
