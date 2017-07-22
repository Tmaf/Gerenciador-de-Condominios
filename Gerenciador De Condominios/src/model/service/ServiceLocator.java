/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import java.util.HashMap;
import java.util.Map;
import model.dao.CrudDao;
import model.dao.crud.impl.*;
import model.domain.*;
import model.domain.pessoas.*;

/**
 *
 * @author Tarcisio Almeida
 */
public class ServiceLocator implements ServiceInterface{
    
    private  Map <Class,Class> map;  
    private static ServiceLocator serviceLocator;
    
    private ServiceLocator(){
     map= new HashMap<>();   
    }
    
    public static ServiceInterface getServiceLocator(){
        if(serviceLocator==null)
            serviceLocator=new ServiceLocator();
        return serviceLocator;
    }
    
    @Override
    public  CrudDao getService(Class dominio){
        CrudDao crud;
        try{
            if(map.size()==0)
                this.initAntigo();
            System.out.println( "" + map.size() + "\n" + map.get(dominio));
            
            
            crud= (CrudDao) (map.get(dominio).newInstance());
        }catch(IllegalAccessException | InstantiationException e){
            crud =null;
        }
        return crud;
    }
    public  void addService(Class dominio,Class cruddao){
            map.put(dominio, cruddao);
    }
    private void initAntigo(){
        map.put(Morador.class, MoradorDaoImpl.class);
        map.put(AreaComum.class, AreaComumDaoImpl.class);
        map.put(Empresa.class, EmpresaDaoImpl.class);
        map.put(Encomenda.class, EncomendaDaoImpl.class);
        map.put(Funcionario.class, FuncionarioDaoImpl.class);
        map.put(Reclamacao.class, ReclamacaoDaoImpl.class);
        map.put(Usuario.class, UsuarioDaoImpl.class);
        map.put(Veiculo.class, VeiculoDaoImpl.class);
        map.put(Visitante.class,VisitanteDaoImpl.class);
        map.put(Reserva.class,ReservaDaoImpl.class);
    }
   
}
