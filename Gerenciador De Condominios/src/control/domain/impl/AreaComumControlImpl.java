/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.AreaComumControl;
import model.domain.AreaComum;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class AreaComumControlImpl extends ControlImpl<AreaComum> implements AreaComumControl{

    @Override
    protected Class getClasse() {
        return AreaComum.class;
    }

    @Override
    protected String converteString( AreaComum e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}