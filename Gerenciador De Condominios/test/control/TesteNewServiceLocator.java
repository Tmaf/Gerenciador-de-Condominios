/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Iterator;
import model.dao.CrudDao;
import model.dao.crud.impl.MoradorDaoImpl;
import model.domain.pessoas.Morador;
import model.service.ServiceClient;
import model.service.ServiceLocator;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class TesteNewServiceLocator {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {

        Morador m = new Morador();

        m.setCpf("TESTEEEEE");
        m.setNome("Tarcísio é foda");
        m.setEmail("fodastico@teste.com");

        ServiceLocator c;
        c = (ServiceLocator) ServiceClient.getServiceLocator();

        c.addService(Morador.class, MoradorDaoImpl.class);

        CrudDao cd = c.getService(Morador.class);

        cd.salvar(m);

        Iterator<Morador> m2 = cd.pesquisar(m).iterator();

        while (m2.hasNext()) {
            System.out.println(m2.next().getNome());
        }

    }

}
