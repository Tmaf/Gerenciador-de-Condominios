/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.crud.impl;

import java.util.HashMap;
import java.util.Map;
import model.dao.CrudDaoImpl;
import model.dao.crud.FinanceiroDao;
import model.domain.Financeiro;

/**
 *
 * @author Aline
 */
public class FinanceiroDaoImpl extends CrudDaoImpl<Financeiro,String> implements FinanceiroDao{
    @Override
    protected String getChave(Financeiro modelo) {
        return modelo.getNroDocumento();
    }

    @Override
    protected String getConsultaSql(Financeiro modelo) {
       StringBuffer sql = new StringBuffer("from Financeiro where "
               + "1=1");
        if(modelo.getNroDocumento()!=null && !modelo.getNroDocumento().equals("")){
            sql.append("and nroDocumento like :nroDocumento " );
        }
        if(modelo.getNome()!=null && !modelo.getNome().equals("")){
            sql.append("and nome like :nome ");
        }
        if(modelo.getCpf()!=null && !modelo.getCpf().equals("")){
            sql.append("and cpf like :cpf ");
        }
        if(modelo.getTipoFinanceiro()!=null && !modelo.getTipoFinanceiro().equals("")){
            sql.append("and tipoFinanceiro like :tipoFinanceiro ");
        }
        if(modelo.getTipoPagamento()!=null && !modelo.getTipoPagamento().equals("")){
            sql.append(" and tipoPagamento like :tipoPagamento ");
        }
        if(modelo.getTipoLancamento()!=null && !modelo.getTipoLancamento().equals("")){
            sql.append(" and tipoLancamento like :tipoLancamento ");
        }
        if(modelo.getEmissao()!=null){
            sql.append(" and emissao = :emissao ");
        } 
        if(modelo.getVencimento()!=null){
            sql.append(" and vencimento = :vencimento ");
        }  
        if(modelo.getBaixa()!=null){
            sql.append(" and baixa = :baixa ");
        }
        
        return sql.toString();    
    }

    @Override
    protected Map<String, Object> getParametrosMapa(Financeiro modelo) {
        
          Map<String,Object> mapa =  new HashMap<>();
        
        if(modelo.getNroDocumento()!=null && !modelo.getNroDocumento().equals("")){
            mapa.put("nroDocumento", modelo.getNroDocumento());
        }
        if(modelo.getNome()!=null && !modelo.getNome().equals("")){
              mapa.put("nome", modelo.getNome());
        }
        if(modelo.getCpf()!=null && !modelo.getCpf().equals("")){
            mapa.put("cpf", modelo.getCpf());
        }
        if(modelo.getTipoFinanceiro()!=null && !modelo.getTipoFinanceiro().equals("")){
              mapa.put("tipoFinanceiro", modelo.getTipoFinanceiro());
        }
        if(modelo.getTipoPagamento()!=null && !modelo.getTipoPagamento().equals("")){
              mapa.put("tipoPagamento", modelo.getTipoPagamento());
        }
        if(modelo.getTipoLancamento()!=null && !modelo.getTipoLancamento().equals("")){
              mapa.put("tipoLancamento", modelo.getTipoLancamento());
        }
        if(modelo.getEmissao()!=null){
              mapa.put("emissao", modelo.getEmissao());
        }  
        if(modelo.getVencimento()!=null){
              mapa.put("vencimento", modelo.getVencimento());
        }
        if(modelo.getBaixa()!=null){
              mapa.put("baixa", modelo.getBaixa());
        }
         
        return mapa;
    }
    
}
