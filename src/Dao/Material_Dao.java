/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DaoInterfaces.Material_Interface;
import DataBase.Connector;
import Modelo.Material;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Material_Dao implements Material_Interface {
    Connector connector;
    
    public Material_Dao(){
        this.connector = new Connector();
    }
    
    @Override
    public void update(Material mat) {
        String sql = "update Material set ID = ?, Nombre Proveedor = ?, Correo Proveedor = ?, Instrumento o Accesorio = ?, Marca y Modelo = ?, Cantidad = ?, Valor Total = ?, Fecha = ? where ID = ?";
       
        try{
            Material matUpdate = (Material) mat;
            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            
            statement.setString(1, matUpdate.getId() + "");
            statement.setString(2, matUpdate.getNombre_prov());
            statement.setString(2, matUpdate.getCorreo_prov());
            statement.setString(2, matUpdate.getNombre());
            statement.setString(3, matUpdate.getMarca_modelo());
            statement.setString(5, matUpdate.getCantidad() + "");
            statement.setString(4, matUpdate.getValorTotal() + "");
            statement.setString(3, matUpdate.getFecha());
                    
            statement.executeUpdate();
            
            statement.close();
            connector.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void create(Material mat) {
       String sql = "insert into Material (ID,Nombre Proveedor,Correo Proveedor,Instrumento o Accesorio,Marca y Modelo,Cantidad,Valor Total,Fecha) values (?, ?, ?, ?, ?, ?, ?, ?)";
       
        try{
            Material matUpdate = (Material) mat;
            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            
            statement.setString(1, matUpdate.getId() + "");
            statement.setString(2, matUpdate.getNombre_prov());
            statement.setString(3, matUpdate.getCorreo_prov());
            statement.setString(4, matUpdate.getNombre());
            statement.setString(5, matUpdate.getMarca_modelo());
            statement.setString(6, matUpdate.getCantidad()+ "");
            statement.setString(7, matUpdate.getValorTotal() + "");
            statement.setString(7, matUpdate.getFecha());
              
            statement.executeUpdate();
            
            statement.close();
            connector.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "delete from Material where ID = ?";
        
        try{            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);            
            statement.setString(1, id + "");

            statement.executeUpdate();
            
            statement.close();
            connector.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
        
    }
    
    
    @Override
    public Material findById(int id) {
        String sql = "select * from Material where ID = ?";
        Material mat = null;
         
        try{
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            ResultSet resultSet;
            
            statement.setInt(1, id);
                    
            resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                mat = new Material(
                      
                   resultSet.getInt("ID"),
                   resultSet.getString("Nombre Proveedor"),
                   resultSet.getString("Correo Proveedor"),
                   resultSet.getString("Instrumento o Accesorio"),
                   resultSet.getString("Marca y Modelo"),
                   resultSet.getInt("Cantidad"),
                   resultSet.getDouble("Valor Total"), 
                   resultSet.getString("Fecha"));

            }
            
            resultSet.close();
            statement.close();
            connector.getConnection().close();
        } catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        
        return mat;
    }
    
    public ArrayList<Material> findAll(){
        String sql = "select * from Material"; 
        ArrayList<Material> lista = new ArrayList<>();
        
        try {
            Statement statement;
       
            statement = connector.getConnection().createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(sql);
        
            while (resultSet.next()) {
                Material mat = new Material(
                   resultSet.getInt("ID"),
                   resultSet.getString("Nombre Proveedor"),
                   resultSet.getString("Correo Proveedor"),
                   resultSet.getString("Instrumento o Accesorio"),
                   resultSet.getString("Marca y Modelo"),
                   resultSet.getInt("Cantidad"),
                   resultSet.getDouble("Valor Total"), 
                   resultSet.getString("Fecha"));
                
                lista.add(mat);
            }
            
            resultSet.close();
            statement.close();
            connector.getConnection().close();
        } catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        
        return lista;
    }
}
