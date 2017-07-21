/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.Control;
import model.dao.CrudDao;
import model.domain.Empresa;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class EmpresaControlImpl extends Control<Empresa>{

    @Override
    protected Class getClasse() {
       return Empresa.class;
    }
    
    
    
}
