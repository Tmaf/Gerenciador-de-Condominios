package view;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import model.dao.crud.MoradorDao;
import model.dao.crud.impl.MoradorDaoImpl;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("Subindo o servico");
			LocateRegistry.createRegistry(1099);
			Naming.rebind(MoradorDao.NOME_SERVICO, new MoradorDaoImpl());
			System.out.println("Servico de pe");
		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}
	}
}
