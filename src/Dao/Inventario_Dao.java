/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DaoInterfaces.Inventario_Interface;
import DataBase.Connector;
import Modelo.Inventario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Inventario_Dao implements Inventario_Interface{
    private Connector connector;
    
    public Inventario_Dao(){
        connector = Connector.getInstance();
    }
    
    @Override
    public void update(Inventario inv) {
        String sql = "update Inventario set ID = ?,Instrumento_o_Accesorio= ?,Marca_y_Modelo= ?,Cantidad_Disponible= ?,Valor_Unitario= ? where ID= ?";
       
        try{
            Inventario invUpdate = (Inventario) inv;
            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            
            statement.setString(1, invUpdate.getId() + "");
            statement.setString(2, invUpdate.getNombre());
            statement.setString(3, invUpdate.getMarca_modelo());
            statement.setString(4, invUpdate.getPrecio() + "");
            statement.setString(5, invUpdate.getCantidad() + "");
                    
            statement.executeUpdate();
            
            statement.close();

        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void create(Inventario inv) {
       String sql = "insert into Inventario (ID,Instrumento_o-Accesorio,Marca_y_Modelo,Cantidad_Disponible,Valor_Unitario) values (?, ?, ?, ?, ?)";
       
        try{
            Inventario invUpdate = (Inventario) inv;
            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            
            statement.setString(1, invUpdate.getId() + "");
            statement.setString(2, invUpdate.getNombre());
            statement.setString(3, invUpdate.getMarca_modelo());
            statement.setString(4, invUpdate.getPrecio() + "");
            statement.setString(5, invUpdate.getCantidad()+ "");
                    
                    
            statement.executeUpdate();
            
            statement.close();

        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "delete from Inventario where ID = ?";
        
        try{            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);            
            statement.setString(1, id + "");

            statement.executeUpdate();
            
            statement.close();

        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
        
    }
    
    
    @Override
    public Inventario findById(int id) {
        String sql = "select * from Inventario where ID = ?";
        Inventario inv = null;
         
        try{
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            ResultSet resultSet;
            
            statement.setInt(1, id);
                    
            resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                inv = new Inventario(
                   resultSet.getInt("ID"),
                   resultSet.getString("Instrumento_o_Accesorio"),
                   resultSet.getString("Marca_y_Modelo"),
                   resultSet.getInt("Cantidad_Disponible"),
                   resultSet.getDouble("Valor_Unitario"));

            }
            
            resultSet.close();
            statement.close();

        } catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        
        return inv;
    }
    
    public ArrayList<Inventario> findAll(){
        String sql = "select * from Inventario"; 
        ArrayList<Inventario> lista = new ArrayList<>();
        
        try {
            Statement statement;
       
            statement = connector.getConnection().createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(sql);
        
            while (resultSet.next()) {
                Inventario inv = new Inventario(
                   resultSet.getInt("ID"),
                   resultSet.getString("Instrumento_o_Accesorio"),
                   resultSet.getString("Marca_y_Modelo"),
                   resultSet.getInt("Cantidad_Disponible"),
                   resultSet.getDouble("Valor_Unitario"));
                
                lista.add(inv);
            }
            
            resultSet.close();
            statement.close();

        } catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        
        return lista;
    }
    public void closeConnection() {
        try {
            connector.getConnection().close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión: " + ex.getMessage());
        }
    }
}
