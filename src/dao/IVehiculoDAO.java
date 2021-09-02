/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.VehiculoModel;

/**
 *
 * @author Lau
 */
public interface IVehiculoDAO {
    //defino los metodos para usar los datos de vehiculo luego
    public List<VehiculoModel> obtenerVehiculos();
    
    //en mi caso al ser un vehiculo el cual se identifica por la placa
    //el atributo placa es una cadena mas no un entero
    public VehiculoModel obtenerVehiculo(String placa);
    
    //el metodo para agregar un vehiculo nuevo
    public void agregarVehiculo(VehiculoModel vehiculo);
    
    //el metodo para editar los valores del vehiculo dentro de la bd
    public void actualizarVehiculo(VehiculoModel vehiculo);
    
    //el metodo para eliminar el registro del vehiculo
    public void elminarVehiculo(String placa);
}
