/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class EtiquetasFormularios extends JLabel{
    
    //Etiquetas para vehiculo
    JLabel placa, marca, modelo, año, capacidad, color, kilometros;
    
    //tipos de joption
    JLabel buscar_datos;
    
    //Errores en formularios
    JLabel error_placa, error_marca, error_modelo, error_año, error_capacidad, error_color, error_kilometros;
    boolean flag_placa = false;
    boolean flag_marca = false;
    boolean flag_modelo = false;
    boolean flag_año = false;
    boolean flag_capacidad = false;
    boolean flag_color = false;
    boolean flag_kilometraje = false;
    
    public JLabel getPlaca() {
        return placa;
    }

    public void setPlaca(JLabel placa) {
        this.placa = placa;
    }

    public JLabel getMarca() {
        return marca;
    }

    public void setMarca(JLabel marca) {
        this.marca = marca;
    }

    public JLabel getModelo() {
        return modelo;
    }

    public void setModelo(JLabel modelo) {
        this.modelo = modelo;
    }

    public JLabel getAño() {
        return año;
    }

    public void setAño(JLabel año) {
        this.año = año;
    }

    public JLabel getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(JLabel capacidad) {
        this.capacidad = capacidad;
    }

    public JLabel getColor() {
        return color;
    }

    public void setColor(JLabel color) {
        this.color = color;
    }

    public JLabel getKilometros() {
        return kilometros;
    }

    public void setKilometros(JLabel kilometros) {
        this.kilometros = kilometros;
    }

    public JLabel getBuscar_datos() {
        return buscar_datos;
    }

    public void setBuscar_datos(JLabel buscar_datos) {
        this.buscar_datos = buscar_datos;
    }

    public JLabel getError_placa() {
        return error_placa;
    }

    public void setError_placa(JLabel error_placa) {
        this.error_placa = error_placa;
    }

    public JLabel getError_marca() {
        return error_marca;
    }

    public void setError_marca(JLabel error_marca) {
        this.error_marca = error_marca;
    }

    public JLabel getError_modelo() {
        return error_modelo;
    }

    public void setError_modelo(JLabel error_modelo) {
        this.error_modelo = error_modelo;
    }

    public JLabel getError_año() {
        return error_año;
    }

    public void setError_año(JLabel error_año) {
        this.error_año = error_año;
    }

    public JLabel getError_capacidad() {
        return error_capacidad;
    }

    public void setError_capacidad(JLabel error_capacidad) {
        this.error_capacidad = error_capacidad;
    }

    public JLabel getError_color() {
        return error_color;
    }

    public void setError_color(JLabel error_color) {
        this.error_color = error_color;
    }

    public JLabel getError_kilometros() {
        return error_kilometros;
    }

    public void setError_kilometros(JLabel error_kilometros) {
        this.error_kilometros = error_kilometros;
    }

    public boolean isFlag_placa() {
        return flag_placa;
    }

    public void setFlag_placa(boolean flag_placa) {
        this.flag_placa = flag_placa;
    }

    public boolean isFlag_marca() {
        return flag_marca;
    }

    public void setFlag_marca(boolean flag_marca) {
        this.flag_marca = flag_marca;
    }

    public boolean isFlag_modelo() {
        return flag_modelo;
    }

    public void setFlag_modelo(boolean flag_modelo) {
        this.flag_modelo = flag_modelo;
    }

    public boolean isFlag_año() {
        return flag_año;
    }

    public void setFlag_año(boolean flag_año) {
        this.flag_año = flag_año;
    }

    public boolean isFlag_capacidad() {
        return flag_capacidad;
    }

    public void setFlag_capacidad(boolean flag_capacidad) {
        this.flag_capacidad = flag_capacidad;
    }

    public boolean isFlag_color() {
        return flag_color;
    }

    public void setFlag_color(boolean flag_color) {
        this.flag_color = flag_color;
    }

    public boolean isFlag_kilometraje() {
        return flag_kilometraje;
    }

    public void setFlag_kilometraje(boolean flag_kilometraje) {
        this.flag_kilometraje = flag_kilometraje;
    }
}
