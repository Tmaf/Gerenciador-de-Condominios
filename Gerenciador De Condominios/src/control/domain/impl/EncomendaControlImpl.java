/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.EncomendaControl;
import model.domain.Encomenda;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class EncomendaControlImpl extends ControlImpl<Encomenda> implements EncomendaControl{

    @Override
    protected Class getClasse() {
        return Encomenda.class;
    }

    @Override
    protected String converteString(Encomenda e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
