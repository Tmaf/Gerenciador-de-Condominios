/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.VeiculoControl;
import model.domain.Veiculo;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class VeiculoControlImpl  extends ControlImpl<Veiculo> implements VeiculoControl{

    @Override
    protected Class getClasse() {
        return Veiculo.class;
    }
    
    
}