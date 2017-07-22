/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.crud.impl;

import java.util.HashMap;
import java.util.Map;
import model.dao.CrudDaoImpl;
import model.dao.crud.ReservaDao;
import model.domain.Reserva;

/**
 *
 * @author Aline
 */
public class ReservaDaoImpl extends CrudDaoImpl<Reserva,Integer> implements ReservaDao{

    @Override
    protected Integer getChave(Reserva modelo) {
       return modelo.getCod();
    }

    @Override
    protected String getConsultaSql(Reserva modelo) {
        
        StringBuffer sql = new StringBuffer("from Reserva where "
               + "1=1");
        if(modelo.getArea().getNomeArea()!=null && !modelo.getArea().getNomeArea().equals("")){
            sql.append("and area like :area ");
        }
        if(modelo.getPessoa().getCpf()!=null && !modelo.getPessoa().getCpf().equals("")){
            sql.append("and pessoa like :pessoa ");
        }
        if(modelo.getHorarioInicio()!= null){
            sql.append("and horarioInicio like :horarioInicio");
        }
        if(modelo.getHorarioFim() != null){
            sql.append("and horarioFim like :horarioFim");
        }
        if(modelo.isDiaTodo() != false){
            sql.append(" and diaTodo = :prestadorDeServico ");
        }
        return sql.toString();
   }

    @Override
    protected Map<String, Object> getParametrosMapa(Reserva modelo) {
        
                    Map<String,Object> mapa =  new HashMap<>();

        if(modelo.getArea().getNomeArea()!=null && !modelo.getArea().getNomeArea().equals("")){
            mapa.put("area", modelo.getArea().getNomeArea());
        }
        if(modelo.getPessoa().getCpf()!=null && !modelo.getPessoa().getCpf().equals("")){
            mapa.put("pessoa", modelo.getPessoa().getNome());
        }
        if(modelo.getHorarioInicio()!= null){
            mapa.put("horarioInicio", modelo.getHorarioInicio());
        }
        if(modelo.getHorarioFim() != null){
            mapa.put("horarioFim", modelo.getHorarioFim());
        }
        if(modelo.isDiaTodo() != false){
            mapa.put("diaTodo", modelo.isDiaTodo());
        }
        return mapa;
    }
    
}
