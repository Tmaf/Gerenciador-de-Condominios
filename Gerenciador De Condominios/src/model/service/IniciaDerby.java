/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aline
 */
public class IniciaDerby {
    
    private Connection con;
    public IniciaDerby(){
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Gerenciador", "root", "root");
            System.out.println("Banco de dados Conectado!");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}
