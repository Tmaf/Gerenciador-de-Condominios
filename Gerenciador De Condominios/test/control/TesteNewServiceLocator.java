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
import model.domain.pessoas.Morador;
import model.domain.pessoas.Usuario;
import model.service.ServiceClient;
import model.service.ServiceInterface;

/**
 *
 * @author Tarcísio M. Almeida
 */
public class TesteNewServiceLocator {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {

        Usuario m = new Usuario();

        m.setCpf("12345");
        m.setNome("Tarcísio é foda");
        m.setPermissao("Sindico");
        m.setSenha("12345");
        
       ServiceInterface service= ServiceClient.getServiceLocator();
 
       
        CrudDao cd = service.getService(Usuario.class);

        cd.salvar(m);

        Iterator<Morador> m2 = cd.pesquisar(m).iterator();

        while (m2.hasNext()) {
            System.out.println(m2.next().getNome());
        }

    }

}
