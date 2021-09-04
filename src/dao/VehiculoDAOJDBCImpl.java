package dao;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.VehiculoModel;

//importo la libreria conexion para su respectivo uso
import util.Conexion;

/**
 *
 * @author 
 */
public class VehiculoDAOJDBCImpl implements IVehiculoDAO{

    @Override
    public List<VehiculoModel> consultarVehiculos() {
        Connection conn = null; //definimos la variable para nuestra conexion
        List<VehiculoModel> vehiculos = new ArrayList<>(); //creo el respectivo arreglo para los vehiculos
        
        //creo la conexion
        try{
            conn = Conexion.getConnection(); //creo la conexion
            String sql = "Select * from vehiculo"; //creo la sentencia sql para ejecutar
            Statement statement = conn.createStatement(); //creo el estado para luego 
            ResultSet result = statement.executeQuery(sql); //ejecutar la sentencia o query
            while(result.next()){
                VehiculoModel vehiculo = new VehiculoModel(result.getString(1), result.getString(2), 
                            result.getString(3), result.getInt(4), result.getInt(5), result.getString(6), result.getInt(7));
                vehiculos.add(vehiculo);
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Codigo : " + ex.getErrorCode() + "\nError : " + ex.getMessage());
                    
        }
        return vehiculos; //al final retorna nuestro arraylist con el contenido del vehiculo o vehiculos
    }

    @Override
    public VehiculoModel consultarVehiculo(String placa) {
        //creo la variable de conexion
        Connection conn = null;
        VehiculoModel vehiculo = null; //defino un objeto de vehiculo como nulo
        try{
            conn = Conexion.getConnection();
            String sql = "Select * from vehiculo where vehPlaca=?";
            PreparedStatement statement = conn.prepareStatement(sql); //se prepara para la query
            statement.setString(1, placa);
            ResultSet result = statement.executeQuery(sql);
            while(result.next()){
                vehiculo = new VehiculoModel(result.getString(1), result.getString(2), result.getString(3), 
                            result.getInt(4), result.getInt(5), result.getString(6), result.getInt(7));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Codigo : " + ex.getErrorCode() + "\nError: " + ex.getMessage());
        }
        
        return vehiculo;
    }

    @Override
    public void agregarVehiculo(VehiculoModel vehiculo) {
        //metodo para agregar un vehiculo nuevo
        Connection conn = null;
        try{
            conn = Conexion.getConnection();
            String sql = "Insert into vehiculo(veh_placa, veh_marca, veh_modelo, veh_anio, veh_capacidad, veh_color, veh_kilometros) values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, vehiculo.getVehPlaca());
            statement.setString(2, vehiculo.getVehMarca());
            statement.setString(3, vehiculo.getVehModelo());
            statement.setInt(4, vehiculo.getVehAnio());
            statement.setInt(5, vehiculo.getVehCapacidad());
            statement.setString(6, vehiculo.getVehColor());
            statement.setInt(7, vehiculo.getVehKilometros());
            //para insert into se usa executeUpdate();
            int rowUpdated = statement.executeUpdate();
            if(rowUpdated > 0){
                JOptionPane.showMessageDialog(null, "El registro fue " 
                        + " creado exitosamente.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Codigo : " + ex.getErrorCode() + "\nError : " + ex.getMessage());
        }
    }

    @Override
    public void actualizarVehiculo(VehiculoModel vehiculo) {
        Connection conn = null;
        try{
            conn = Conexion.getConnection();
            String sql = "update vehiculo set veh_marca=?, veh_modelo=?, veh_anio=?, veh_capacidad=?, veh_color=?, veh_kilometros=? where veh_placa=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, vehiculo.getVehMarca());
            statement.setString(2, vehiculo.getVehModelo());
            statement.setInt(3, vehiculo.getVehAnio());
            statement.setInt(4, vehiculo.getVehCapacidad());
            statement.setString(5, vehiculo.getVehColor());
            statement.setInt(6, vehiculo.getVehKilometros());
            statement.setString(7, vehiculo.getVehPlaca());
            int rowUpdated = statement.executeUpdate();
            if(rowUpdated > 0){
                //JOptionPane.showMessageDialog(null, "Registro actualizado de manera correcta");
                System.out.println("Registro actualizado de manera correcta");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Codigo : " + ex.getErrorCode() + "\nError : " + ex.getMessage());
        }
    }

    @Override
    public void elminarVehiculo(String placa) {
        //metodo para eliminar, tambien se usa executeUpdate();
        Connection conn = null;
        try{
            conn = Conexion.getConnection();
            String sql = "delete from vehiculo where veh_placa=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, placa);
            int rowsDelete = statement.executeUpdate();
            if(rowsDelete > 0){
                JOptionPane.showMessageDialog(null, "Registro eliminado de manera correcta");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VehiculoDAOJDBCImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<VehiculoModel> buscarVehiculos(String placa) {
        Connection conn = null; //definimos la variable para nuestra conexion
        List<VehiculoModel> vehiculos = new ArrayList<>(); //creo el respectivo arreglo para los vehiculos
        //creo la conexion
        try{
            conn = Conexion.getConnection(); //creo la conexion
            String sql = "Select * from vehiculo where veh_placa like '%"+placa+"%'"; //creo la sentencia sql para ejecutar
            Statement statement = conn.createStatement(); //creo el estado para luego 
            ResultSet result = statement.executeQuery(sql); //ejecutar la sentencia o query
            //int data = result.getRow();
            //if(data > 0){
            while(result.next()){
                VehiculoModel vehiculo = new VehiculoModel(result.getString(1), result.getString(2), 
                            result.getString(3), result.getInt(4), result.getInt(5), result.getString(6), result.getInt(7));
                vehiculos.add(vehiculo);
                }
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Codigo : " + ex.getErrorCode() + "\nError : " + ex.getMessage());
                    
        }
        return vehiculos;
    }
}
