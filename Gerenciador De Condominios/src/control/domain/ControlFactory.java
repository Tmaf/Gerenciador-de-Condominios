/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.domain;

import control.domain.impl.*;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Tarcísio M. Almeida
 */
public abstract class ControlFactory {

    public static AreaComumControl getAreaComumControl() throws RemoteException, NotBoundException, MalformedURLException {
        return new AreaComumControlImpl();
    }

    public static EmpresaControl getEmpresaControl() throws RemoteException, NotBoundException, MalformedURLException {
        return new EmpresaControlImpl();
    }

    public static EncomendaControl getEncomendaControl() throws RemoteException, NotBoundException, MalformedURLException {
        return new EncomendaControlImpl();
    }

    public static FinanceiroControl getFinanceiroControl() throws RemoteException, NotBoundException, MalformedURLException {
        return new FinanceiroControlImpl();
    }

    public static FuncionarioControl getFuncionarioControl() throws RemoteException, NotBoundException, MalformedURLException {
        return new FuncionarioControlImpl();
    }

    public static MoradorControl getMoradorControl() throws RemoteException, NotBoundException, MalformedURLException {
        return new MoradorControlImpl();
    }

    public static ReclamacaoControl getReclamacaoControl() throws RemoteException, NotBoundException, MalformedURLException {
        return new ReclamacaoControlImpl();
    }

    public static UsuarioControl getUsuarioControl() throws RemoteException, NotBoundException, MalformedURLException {
        return new UsuarioControlImpl();
    }

    public static VeiculoControl getVeiculoControl() throws RemoteException, NotBoundException, MalformedURLException {
        return new VeiculoControlImpl();
    }

    public static VisitanteControl getVisitanteControl() throws RemoteException, NotBoundException, MalformedURLException {
        return new VisitanteControlImpl();
    }

    public static ReservaControl getReservaControl() throws RemoteException, NotBoundException, MalformedURLException {
        return new ReservaControlImpl();
    }
}
