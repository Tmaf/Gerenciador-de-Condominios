/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.EmpresaControl;
import model.domain.Empresa;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class EmpresaControlImpl extends ControlImpl<Empresa> implements EmpresaControl{

    @Override
    protected Class getClasse() {
       return Empresa.class;
    }
    
    
    
}
