/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import javax.swing.JLabel;

/**
 *
 * private String vehPlaca;
    private String vehMarca;
    private String vehModelo;
    private int vehAnio;
    private int vehCapacidad;
    private String vehColor;
    private int vehKilometros;
 */
public class Etiquetas extends JLabel{
    
    //Etiquetas para vehiculo
    JLabel placa, marca, modelo, año, capacidad, color, kilometros;
    
    //Etiquetas para usuario
    JLabel cedula_usuario, nombres, apellidos, correo;
    
    //Etiquetas para conductor
    JLabel cedula_conductor, vehPlacaC;
    
    //Etiquetas para viaje
    JLabel id_viaje, viaje_cedula, conductor_cedula, via_fecha;
    
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

    public JLabel getCedula_usuario() {
        return cedula_usuario;
    }

    public void setCedula_usuario(JLabel cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public JLabel getNombres() {
        return nombres;
    }

    public void setNombres(JLabel nombres) {
        this.nombres = nombres;
    }

    public JLabel getApellidos() {
        return apellidos;
    }

    public void setApellidos(JLabel apellidos) {
        this.apellidos = apellidos;
    }

    public JLabel getCorreo() {
        return correo;
    }

    public void setCorreo(JLabel correo) {
        this.correo = correo;
    }

    public JLabel getCedula_conductor() {
        return cedula_conductor;
    }

    public void setCedula_conductor(JLabel cedula_conductor) {
        this.cedula_conductor = cedula_conductor;
    }

    public JLabel getVehPlacaC() {
        return vehPlacaC;
    }

    public void setVehPlacaC(JLabel vehPlacaC) {
        this.vehPlacaC = vehPlacaC;
    }

    public JLabel getId_viaje() {
        return id_viaje;
    }

    public void setId_viaje(JLabel id_viaje) {
        this.id_viaje = id_viaje;
    }

    public JLabel getViaje_cedula() {
        return viaje_cedula;
    }

    public void setViaje_cedula(JLabel viaje_cedula) {
        this.viaje_cedula = viaje_cedula;
    }

    public JLabel getConductor_cedula() {
        return conductor_cedula;
    }

    public void setConductor_cedula(JLabel conductor_cedula) {
        this.conductor_cedula = conductor_cedula;
    }

    public JLabel getVia_fecha() {
        return via_fecha;
    }

    public void setVia_fecha(JLabel via_fecha) {
        this.via_fecha = via_fecha;
    }
}
