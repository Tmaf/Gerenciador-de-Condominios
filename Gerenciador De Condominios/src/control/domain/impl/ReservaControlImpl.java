/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.ReservaControl;
import model.domain.Reserva;

/**
 *
 * @author Aline
 */
public class ReservaControlImpl extends ControlImpl<Reserva> implements ReservaControl{

    @Override
    protected Class getClasse() {
        return Reserva.class;
    }

    @Override
    protected String converteString(Reserva e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
