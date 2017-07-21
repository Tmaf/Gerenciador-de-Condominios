/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain;

import java.sql.Date;
import java.util.Iterator;
import model.dao.CrudDao;
import model.domain.Financeiro;
import model.service.ServiceLocator;

/**
 *
 * @author Aline
 */
public class FinanceiroControl {
    
    private final CrudDao dao;
    private static FinanceiroControl financeiroControl;
    
    public FinanceiroControl(){
    this.dao=ServiceLocator.getFinanceiroDao();
    }
    
    public static FinanceiroControl getFinanceiroControl(){
        if(financeiroControl==null){
            financeiroControl= new FinanceiroControl();
        }
        return financeiroControl;
    }
    
    public void salvarFinanceiro(String nroDocumento, String fornecedor, String tipoFinanceiro, String tipoPagamento,
            String tipoLancamento, Date emissao, Date vencimento, Date baixa){
        Financeiro m= new Financeiro();
        m.setNroDocumento(nroDocumento);
        m.setFornecedor(fornecedor);
        m.setTipoFinanceiro(tipoFinanceiro);
        m.setTipoPagamento(tipoPagamento);
        m.setTipoLancamento(tipoLancamento);
        m.setEmissao(emissao);
        m.setVencimento(vencimento);
        m.setBaixa(baixa);
        dao.salvar(m);
    }
    
    public void excluirFinanceiro(String nroDocumento, String fornecedor, String tipoFinanceiro, String tipoPagamento,
            String tipoLancamento, Date emissao, Date vencimento, Date baixa){
        Financeiro m= new Financeiro();
        m.setNroDocumento(nroDocumento);
        m.setFornecedor(fornecedor);
        m.setTipoFinanceiro(tipoFinanceiro);
        m.setTipoPagamento(tipoPagamento);
        m.setTipoLancamento(tipoLancamento);
        m.setEmissao(emissao);
        m.setVencimento(vencimento);
        m.setBaixa(baixa);
        dao.excluir(m);
    }
    
    public Iterator pesquisarFinanceiro(String nroDocumento, String fornecedor, String tipoFinanceiro, String tipoPagamento,
            String tipoLancamento, Date emissao, Date vencimento, Date baixa){
        Financeiro m= new Financeiro();
        m.setNroDocumento(nroDocumento);
        m.setFornecedor(fornecedor);
        m.setTipoFinanceiro(tipoFinanceiro);
        m.setTipoPagamento(tipoPagamento);
        m.setTipoLancamento(tipoLancamento);
        m.setEmissao(emissao);
        m.setVencimento(vencimento);
        m.setBaixa(baixa);
        return dao.pesquisar(m).iterator();
    }
}
