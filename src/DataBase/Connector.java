/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Connector {
    private static Connector instance;
    private String nameDatabase = "ghost-music";
    private Connection connection = null;
    
    
    private Connector() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(
                "jdbc:sqlite:C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Ghost-Music\\src\\" + nameDatabase+".db");
            
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
        
    }
    
    public static Connector getInstance() {
        if (instance == null) {
            synchronized (Connector.class) {
                if (instance == null) {
                    instance = new Connector();
                }
            }
        }
        return instance;
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    
}
