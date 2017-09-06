package view;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import model.service.ServiceInterface;
import model.service.ServiceLocator;

public class Main {
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			
			ServiceInterface obj = ServiceLocator.getServiceLocator();
			
			Naming.rebind(ServiceInterface.URL_SERVICO, obj);
			
			System.out.println("Servico inicializado");
			
			System.out.println("RMIServer.Main() thread : " + Thread.currentThread().getName() 
	                + " " + Thread.currentThread().getId());
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
