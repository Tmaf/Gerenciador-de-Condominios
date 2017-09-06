
package control.domain.impl;

import control.domain.AreaComumControl;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import model.domain.AreaComum;

public class AreaComumControlImpl extends ControlImpl<AreaComum> implements AreaComumControl, Serializable{

    public AreaComumControlImpl() throws RemoteException, NotBoundException, MalformedURLException {
    }
    
    
    
    @Override
    protected Class getClasse() throws RemoteException{
        return AreaComum.class;
    }    
}