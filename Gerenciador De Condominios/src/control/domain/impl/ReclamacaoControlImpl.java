/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.ReclamacaoControl;
import model.domain.Reclamacao;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class ReclamacaoControlImpl  extends ControlImpl<Reclamacao> implements ReclamacaoControl{

    @Override
    protected Class getClasse() {
        return Reclamacao.class;
    }
    
    
}