/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain.impl;

import control.domain.Control;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import model.dao.CrudDao;
import model.service.ServiceInterface;
import model.service.ServiceLocator;

/**
 *
 * @author Tarcísio M. Almeida
 * @param <E> Classe do dominio
 */
public abstract class ControlImpl <E extends Serializable> implements Control<E>{
    
    private final CrudDao dao;
    private static ControlImpl control;
    private List<E> buffer;
    
    public ControlImpl(){
        buffer= new ArrayList<>();
        ServiceInterface service;
        service =ServiceLocator.getServiceLocator();
        Class c=this.getClasse();
        System.out.println(c);
        dao =service.getService(c);
    }   
    @Override
    public void salvar(E e){
        dao.salvar(e);
    }
    @Override
    public E bucarPorChave(E e){
    
        List<E>l=dao.pesquisar(e);
        if(l.size()==1){
            return l.get(0);
        }
        else
            return null;
    }
    @Override
    public void excluir(E e){
        dao.excluir(e);
    }
    @Override
    public String[] pesquisar(E e){
        
       buffer = dao.pesquisar(e);
       
       String[] retorno= new String[buffer.size()];
       
      for(int i=0;i<buffer.size();i++){
      
          retorno[i]=this.converteString(buffer.get(i));
      } 
        return retorno;
    }
    @Override
    public E getBufferIndex(int i){
        System.out.println( this.converteString(buffer.get(i)));
        return buffer.get(i);
    }
    
    protected abstract Class getClasse();
    protected abstract String converteString(E e);
}
