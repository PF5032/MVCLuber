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
}
