/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import model.dao.CrudDao;

/**
 *
 * @author Tarcísio M. Almeida
 */
public interface ServiceInterface {

    CrudDao getService(Class dominio);
    
}
