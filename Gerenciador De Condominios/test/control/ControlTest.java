/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.domain.impl.ControlImpl;
import control.domain.*;
import model.domain.pessoas.Morador;


/**
 *
 * @author Tarcisio
 */
public class ControlTest {
    
    public static void main(String[] args) {
       ControlImpl<Morador> mc = ControlFactory.getMoradorControl();
        Morador m1,m2,m3;
        
        m1=new Morador();
        m1.setCpf("Teste");
        m1.setNome("TarcísioTeste");
        m1.setEmail("Tarcisio@Teste");
        m1.setTelefone("xxx-xxx-xx");
        
       mc.salvar(m1);
        m2= new Morador();
        m2.setCpf("Teste");
       m2=mc.bucarPorChave(m2);
        
       System.out.println(m2.getNome());
    }
}

