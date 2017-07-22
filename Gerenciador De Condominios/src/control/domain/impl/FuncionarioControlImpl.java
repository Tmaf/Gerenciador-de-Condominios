/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.Control;
import model.domain.pessoas.Funcionario;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class FuncionarioControlImpl extends Control<Funcionario>{

    @Override
    protected Class getClasse() {
        return Funcionario.class;
    }
    
    
}