/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.domain.FinanceiroControl;
import java.util.Iterator;
import model.domain.Financeiro;

/**
 *
 * @author Tarcisio
 */
public class ControlTest {
    
    public static void main(String[] args) {
        FinanceiroControl mc = new FinanceiroControl();
        
        mc.salvarFinanceiro("12345", "Fornecedor", "Receita","Boleto", "Taxa condominio", new java.sql.Date(new java.util.Date().getTime()), new java.sql.Date(new java.util.Date().getTime()), new java.sql.Date(new java.util.Date().getTime()));

        Iterator it = mc.pesquisarFinanceiro("12345","Fornecedor","Receita","Boleto", "Taxa condominio", new java.sql.Date(new java.util.Date().getTime()), new java.sql.Date(new java.util.Date().getTime()), new java.sql.Date(new java.util.Date().getTime()));
        
        while(it.hasNext()){
            System.out.println(((Financeiro)it.next()).getNroDocumento());
        }
    }
}

