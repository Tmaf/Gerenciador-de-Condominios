/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.FinanceiroControl;
import model.domain.Financeiro;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class FinanceiroControlImpl extends ControlImpl<Financeiro> implements FinanceiroControl{

    @Override
    protected Class getClasse() {
        return Financeiro.class;
    }

    @Override
    protected String converteString(Financeiro e) {
        return e.getCpf() + ": " + e.getNome() +"  " +e.getNroDocumento() + " " + e.getTipoFinanceiro() +
                " " + e.getTipoLancamento() + " " + e.getTipoPagamento() + " " + e.getEmissao() + " " +
                e.getVencimento()+ " " + e.getBaixa() + " " + e.getValor();
    }
    
}
