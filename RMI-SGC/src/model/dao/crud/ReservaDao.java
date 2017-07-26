/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.crud;

import model.dao.CrudDao;
import model.domain.Reserva;

/**
 *
 * @author Aline
 */
public interface ReservaDao extends CrudDao<Reserva,Integer>{
    
	static final String NOME_SERVICO = "ServicoReclamacao";
	static final String URL_SERVICO = "rmi://127.0.0.1/" + NOME_SERVICO;
	
}
