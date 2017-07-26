
package control.domain.impl;

import control.domain.AreaComumControl;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.domain.AreaComum;
import model.service.ServiceClient;

public class AreaComumControlImpl extends ControlImpl<AreaComum> implements AreaComumControl, Serializable{
    
    @Override
    protected Class getClasse() throws RemoteException{
        return NewClass.class;
    }    
}