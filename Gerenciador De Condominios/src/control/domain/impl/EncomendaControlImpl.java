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
        return "Código: " + e.getCodigo() + " Endereço: " + e.getEndereco() +
                " Destinatário: " + e.getDestinatario() + " Entregue: " + e.isEntregue() + 
                " Código correspondência: " + e.getCodCorreio();
    }
    
    
}
