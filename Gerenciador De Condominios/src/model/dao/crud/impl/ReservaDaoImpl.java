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
        if(modelo.getArea()!=null){
            sql.append("and area like :area ");
        }
        if(modelo.getUsuario()!=null){
            sql.append("and usuario like :usuario ");
        }
        if(modelo.getHorarioInicio()!= null){
            sql.append("and horarioInicio = :horarioInicio ");
        }
        if(modelo.getHorarioFim() != null){
            sql.append("and horarioFim = :horarioFim");
        }
        if(modelo.isDiaTodo() != false){
            sql.append(" and diaTodo = :diaTodo ");
        }
        return sql.toString();
   }

    @Override
    protected Map<String, Object> getParametrosMapa(Reserva modelo) {
        
                    Map<String,Object> mapa =  new HashMap<>();

        if(modelo.getArea() !=null){
            mapa.put("area", modelo.getArea());
        }
        if(modelo.getUsuario()!=null){
            mapa.put("usuario", modelo.getUsuario());
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
