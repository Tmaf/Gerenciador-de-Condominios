/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.FuncionarioControl;
import model.domain.pessoas.Funcionario;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class FuncionarioControlImpl extends ControlImpl<Funcionario> implements FuncionarioControl{

    @Override
    protected Class getClasse() {
        return Funcionario.class;
    }

    @Override
    protected String converteString(Funcionario e) {
         return "CPF: " + e.getCpf() + " Nome: " + e.getNome() +" Telefone: " +e.getTelefone() +
                 " Setor: " + e.getSetorDeServico() + " Hora Entrada: " + e.getHorarioEntrada() +
                 " Hora Saída: " + e.getHorarioSaida();
    }
}