/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DaoInterfaces.Inventario_Interface;
import DataBase.Connector;
import Modelo.Instrumento_Accesorio;
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
    Connector connector = null;
    
    public Inventario_Dao(){
        this.connector = new Connector();
    }
    
    @Override
    public void update(Inventario inv, Instrumento_Accesorio ins) {
        String sql = "update clients set nombre = ?, correo = ?, tipo_membresia = ?, telefono = ?, direccion = ?, cedula = ? where id = ?";
       
        try{
            Inventario invUpdate = (Inventario) inv;
            Instrumento_Accesorio insUpdate = (Instrumento_Accesorio) ins;
            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            
            statement.setString(1, inv.getId() + "");
            statement.setString(2, ins.getNombre());
            statement.setString(3, ins.getMarca_modelo());
            statement.setString(4, ins.getPrecio() + "");
            statement.setString(5, inv.getCantidadDisponible() + "");
                    
            statement.executeUpdate();
            
            statement.close();
            connector.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void create(Inventario inv, Instrumento_Accesorio ins) {
       String sql = "insert into clients (nombre, correo, tipo_membresia, telefono, direccion, cedula) values (?, ?, ?, ?, ?, ?)";
       
        try{
            Inventario invUpdate = (Inventario) inv;
            Instrumento_Accesorio insUpdate = (Instrumento_Accesorio) ins;
            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            
            statement.setString(1, inv.getId() + "");
            statement.setString(2, ins.getNombre());
            statement.setString(3, ins.getMarca_modelo());
            statement.setString(4, ins.getPrecio() + "");
            statement.setString(5, inv.getCantidadDisponible() + "");
                    
                    
            statement.executeUpdate();
            
            statement.close();
            connector.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "delete from clients where id = ?";
        
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
    public Inventario findById(int id) {
        String sql = "select * from clients where id = ?";
        Inventario invModel = null;
         
        try{
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            ResultSet resultSet;
            
            statement.setInt(1, id);
                    
            resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                invModel = new Inventario(
                   resultSet.getInt("ID"),
                   resultSet.getString("Instrumento O Accesorio"),
                   resultSet.getString("Marca y Modelo"),
                   resultSet.getInt("Cantidad Disponible"),
                   resultSet.getInt("Valor Unitario"));
            }
            
            resultSet.close();
            statement.close();
            connector.getConnection().close();
        } catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        
        return model;
    }
    
    public ArrayList<ClientsModel> findAll(){
        String sql = "select * from clients"; 
        ArrayList<ClientsModel> lista = new ArrayList<>();
        
        try {
            Statement statement;
       
            statement = connector.getConnection().createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(sql);
        
            while (resultSet.next()) {
                ClientsModel model = new ClientsModel(
                   resultSet.getInt("id"),
                   resultSet.getString("nombre"),
                   resultSet.getString("correo"),
                   resultSet.getInt("tipo_membresia"),
                   resultSet.getString("telefono"),
                   resultSet.getString("direccion"),
                   resultSet.getString("cedula")
                );
                lista.add(model);
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
