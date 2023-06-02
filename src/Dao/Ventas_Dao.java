/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DaoInterfaces.Ventas_Interface;
import DataBase.Connector;
import Modelo.Venta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Ventas_Dao implements Ventas_Interface{
    private Connector connector;
    
    public Ventas_Dao(){
        connector = Connector.getInstance();
    }
    
    @Override
    public void update(Venta venta) {
        String sql = "update Ventas set ID = ?,Nombre_Cliente= ?,Correo_Cliente= ?,Instrumento_o_Accesorio= ?,Marca_y_Modelo= ?,Cantidad= ?,Valor_Total= ?,Fecha= ? where ID= ?";
       
        try{
            Venta ventaUpdate = (Venta) venta;
            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            
            statement.setString(1, ventaUpdate.getId() + "");
            statement.setString(2, ventaUpdate.getNombre_cli());
            statement.setString(3, ventaUpdate.getCorreo_cli());
            statement.setString(4, ventaUpdate.getNombre());
            statement.setString(5, ventaUpdate.getMarca_modelo());
            statement.setString(6, ventaUpdate.getCantidad() + "");
            statement.setString(7, ventaUpdate.getValorTotal() + "");
            statement.setString(8, ventaUpdate.getFecha());
                    
            statement.executeUpdate();
            
            statement.close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void create(Venta venta) {
       String sql = "insert into Ventas (ID,Nombre_Cliente,Correo_Cliente,Instrumento_o_Accesorio,Marca_y_Modelo,Cantidad,Valor_Total,Fecha) values (?, ?, ?, ?, ?, ?, ?, ?)";
       
        try{
            Venta ventaUpdate = (Venta) venta;
            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            
            statement.setString(1, ventaUpdate.getId() + "");
            statement.setString(2, ventaUpdate.getNombre_cli());
            statement.setString(3, ventaUpdate.getCorreo_cli());
            statement.setString(4, ventaUpdate.getNombre());
            statement.setString(5, ventaUpdate.getMarca_modelo());
            statement.setString(6, ventaUpdate.getCantidad()+ "");
            statement.setString(7, ventaUpdate.getValorTotal() + "");
            statement.setString(8, ventaUpdate.getFecha());
              
            statement.executeUpdate();
            
            statement.close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "delete from Ventas where ID = ?";
        
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
    public Venta findById(int id) {
        String sql = "select * from Ventas where ID = ?";
        Venta venta = null;
         
        try{
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            ResultSet resultSet;
            
            statement.setInt(1, id);
                    
            resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                venta = new Venta(
                      
                   resultSet.getInt("ID"),
                   resultSet.getString("Nombre_Cliente"),
                   resultSet.getString("Correo_Cliente"),
                   resultSet.getString("Instrumento_o_Accesorio"),
                   resultSet.getString("Marca_y_Modelo"),
                   resultSet.getInt("Cantidad"),
                   resultSet.getDouble("Valor_Total"), 
                   resultSet.getString("Fecha"));

            }
            
            resultSet.close();
            statement.close();
        } catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        
        return venta;
    }
    
    public ArrayList<Venta> findAll(){
        String sql = "select * from Ventas"; 
        ArrayList<Venta> lista = new ArrayList<>();
        
        try {
            Statement statement;
       
            statement = connector.getConnection().createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(sql);
        
            while (resultSet.next()) {
                Venta venta = new Venta(
                   resultSet.getInt("ID"),
                   resultSet.getString("Nombre_Cliente"),
                   resultSet.getString("Correo_Cliente"),
                   resultSet.getString("Instrumento_o_Accesorio"),
                   resultSet.getString("Marca_y_Modelo"),
                   resultSet.getInt("Cantidad"),
                   resultSet.getDouble("Valor_Total"), 
                   resultSet.getString("Fecha"));
                
                lista.add(venta);
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
