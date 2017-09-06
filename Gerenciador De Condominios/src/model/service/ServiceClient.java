/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Vinicius
 */
public class ServiceClient implements Serializable {

    /**
     *
     * @return @throws RemoteException
     * @throws NotBoundException
     * @throws java.net.MalformedURLException
     */
    
    public static ServiceInterface getServiceLocator() throws RemoteException, NotBoundException, MalformedURLException {
        try {
            ServiceInterface clientService = (ServiceInterface) Naming.lookup("rmi://127.0.0.1/ServicoCrud");
            return clientService;
        } catch (NotBoundException | RemoteException e) {
            System.out.println("Erro ao localizar o crud: " + e.getMessage());
        }

        return null;
    }

}
