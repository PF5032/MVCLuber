/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.IVehiculoDAO;
import dao.VehiculoDAOJDBCImpl;
import java.sql.Connection;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.VehiculoModel;

/**
 *
 * @author Lau
 */
public class VehiculoController {
    private IVehiculoDAO vehiculoDAO; //llamo a nuestra interfaz dao para luego crear un objeto del jdbc
    
    public VehiculoController(){
        //creo un objeto el cual me va a traer los metodos del jdbc
        vehiculoDAO = new VehiculoDAOJDBCImpl();
    }
    
    //En editar y eliminar ocupo que me traiga todos los campos de la tabla vehiculos
    public DefaultTableModel consultarVehiculos(){
        //un arreglo del tipo string para obtener los atributos de vehiculo
        String[] titulos = {"Placa", "Marca", "Modelo", "Año", "Capacidad", "Color", "Kilometros"};
        
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        List<VehiculoModel> vehiculos = vehiculoDAO.consultarVehiculos(); //creo una variable la cual tendra los vehiculos que traera la consulta
        for(VehiculoModel vehiculo: vehiculos){
            String[] fila = new String[7]; //uso las mismas variables del ejemplo solo para guiarme
            fila[0] = vehiculo.getVehPlaca()+"";
            fila[1] = vehiculo.getVehMarca()+"";
            fila[2] = vehiculo.getVehModelo()+"";
            fila[3] = vehiculo.getVehAnio()+"";
            fila[4] = vehiculo.getVehCapacidad()+"";
            fila[5] = vehiculo.getVehColor()+"";
            fila[6] = vehiculo.getVehKilometros()+"";
            model.addRow(fila);
        }
        return model;
    }
    
    //implemento el modelo que me trae la sentencia like del daoimpl
    public DefaultTableModel buscarVehiculos(String placa){
        //un arreglo del tipo string para obtener los atributos de vehiculo
        String[] titulos = {"Placa", "Marca", "Modelo", "Año", "Capacidad", "Color", "Kilometros"};
        
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        List<VehiculoModel> vehiculos = vehiculoDAO.buscarVehiculos(placa);
        for(VehiculoModel vehiculo: vehiculos){
            String[] fila = new String[7];
            fila[0] = vehiculo.getVehPlaca()+"";
            fila[1] = vehiculo.getVehMarca()+"";
            fila[2] = vehiculo.getVehModelo()+"";
            fila[3] = vehiculo.getVehAnio()+"";
            fila[4] = vehiculo.getVehCapacidad()+"";
            fila[5] = vehiculo.getVehColor()+"";
            fila[6] = vehiculo.getVehKilometros()+"";
            model.addRow(fila);
        }
        return model;
    } 
    
    //lo otros metodos vienen del dao
    
    public void agregarVehiculo(VehiculoModel vehiculo){
        vehiculoDAO.agregarVehiculo(vehiculo);
    }
    
    public void actualizarVehiculo(VehiculoModel vehiculo){
        vehiculoDAO.actualizarVehiculo(vehiculo);
    }
    
    public void eliminarVehiculo(String placa){
        vehiculoDAO.elminarVehiculo(placa);
    }
}
