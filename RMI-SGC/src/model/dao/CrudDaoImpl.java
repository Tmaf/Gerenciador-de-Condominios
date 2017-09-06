/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.domain.pessoas.Usuario;

/**
 *
 * @author tarci
 * @param <E>
 * @param <I>
 */
public abstract class CrudDaoImpl <E extends Serializable, I> extends UnicastRemoteObject implements CrudDao <E,I>{

	private static final long serialVersionUID = 1L;
	
	public CrudDaoImpl() throws RemoteException{
	}
	
    @Override
    public void salvar(E classeModelo){
    
        EntityManager em = Conexao.getConexao();
        em.getTransaction().begin();
        if(this.getChave((E)(Usuario)classeModelo)!=null){
            classeModelo = em.merge(classeModelo);
        }
        em.persist(classeModelo);
        em.getTransaction().commit();
        em.close();
    
    }
    
    @Override
    public void excluir(E classeModelo){
    
        EntityManager em = Conexao.getConexao();
        em.getTransaction().begin();
        classeModelo= em.merge(classeModelo);
        em.remove(classeModelo);
        
        em.getTransaction().commit();
        em.close();
    
    }
    
    @Override
    public List<E> pesquisar(E classeModelo){
        EntityManager em = Conexao.getConexao();
        
        String sql=this.getConsultaSql(classeModelo);
        
        Query q = em.createQuery(sql);
        
        Map<String,Object>parametros= getParametrosMapa(classeModelo);
        
        for(String chave: parametros.keySet()){
        
            q.setParameter(chave,parametros.get(chave));
        }
        
       
        List<E> l= q.getResultList();
        
       em.close();
       return l;
    }

    //Template Method
    protected abstract I getChave(E modelo);
    protected abstract String getConsultaSql(E modelo); 
    protected abstract Map<String, Object> getParametrosMapa(E classeModelo);
}
