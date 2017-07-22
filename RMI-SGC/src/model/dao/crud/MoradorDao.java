/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.crud;

import java.util.List;
import model.dao.CrudDao;
import model.domain.pessoas.Morador;
/**
 *
 * @author  Tarcisio.lima
 */
public interface MoradorDao extends CrudDao<Morador,String>{
	static final String NOME_SERVICO = "ServicoCliente";
	static final String URL_SERVICO = "rmi://127.0.0.1/" + NOME_SERVICO;
}
