package dao;

import java.util.List;
import model.VehiculoModel;

/**
 *
 * @author Juan Pablo S
 */
public interface IVehiculoDAO {
    //Defino los metodos para usar los datos de vehiculo luego
    public List<VehiculoModel> consultarVehiculos();
    
    //La llave principal de la tabla es una cadena
    public VehiculoModel consultarVehiculo(String placa);
    
    //El metodo para agregar un vehiculo nuevo
    public void agregarVehiculo(VehiculoModel vehiculo);
    
    //El metodo para editar los valores del vehiculo dentro de la bd
    public void actualizarVehiculo(VehiculoModel vehiculo);
    
    //El metodo para eliminar el registro del vehiculo
    public void elminarVehiculo(String placa);
    
    //Para buscar el registro del vehiculo en la tabla deacuerdo a su placa
    public List<VehiculoModel> buscarVehiculos(String placa);
}
