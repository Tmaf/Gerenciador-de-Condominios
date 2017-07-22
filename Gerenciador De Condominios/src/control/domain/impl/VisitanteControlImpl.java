/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.Control;
import model.domain.pessoas.Visitante;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class VisitanteControlImpl  extends Control<Visitante>{

    @Override
    protected Class getClasse() {
        return Visitante.class;
    }
    
    
}