/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain;

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
public abstract class Control <E extends Serializable>{
    
    private final CrudDao dao;
    private static Control control;
    private List<E> buffer;
    
    public Control(){
        buffer= new ArrayList<>();
        ServiceInterface service;
        service =ServiceLocator.getServiceLocator();
        Class c=this.getClasse();
        System.out.println(c);
        dao =service.getService(c);
    }   
    public void salvar(E e){
        dao.salvar(e);
    }
    public E bucarPorChave(E e){
    
        List<E>l=dao.pesquisar(e);
        if(l.size()==1){
            return l.get(0);
        }
        else
            return null;
    }
    public void excluir(E e){
        dao.excluir(e);
    }
    public String[] pesquisarEmpresa(E e){
        
       buffer = dao.pesquisar(e);
       
       String[] retorno= new String[buffer.size()];
       
      for(int i=0;i<buffer.size();i++){
      
          retorno[i]=buffer.get(i).toString();
      } 
        return retorno;
    }
    public E getBufferIndex(int i){
        return buffer.get(i);
    }
    protected abstract Class getClasse();
    
}
