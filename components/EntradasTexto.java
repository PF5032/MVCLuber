/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import javax.swing.JTextField;

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
public class EntradasTexto extends JTextField{
    
    JTextField vehPlaca, vehMarca, vehModelo, vehAño, vehCapacidad, vehColor, vehKilometros;
    
    public EntradasTexto(){
        vehPlaca = new JTextField(20);
        vehMarca = new JTextField(10);
        vehModelo = new JTextField(10);
        vehAño = new JTextField(10);
        vehCapacidad = new JTextField(10);
        vehColor = new JTextField(10);
        vehKilometros = new JTextField(10);
    }

    public JTextField getVehPlaca() {
        return vehPlaca;
    }

    public JTextField getVehMarca() {
        return vehMarca;
    }

    public JTextField getVehModelo() {
        return vehModelo;
    }

    public JTextField getVehAño() {
        return vehAño;
    }

    public JTextField getVehCapacidad() {
        return vehCapacidad;
    }

    public JTextField getVehColor() {
        return vehColor;
    }

    public JTextField getVehKilometros() {
        return vehKilometros;
    }

    public void setVehPlaca(JTextField vehPlaca) {
        this.vehPlaca = vehPlaca;
    }

    public void setVehMarca(JTextField vehMarca) {
        this.vehMarca = vehMarca;
    }

    public void setVehModelo(JTextField vehModelo) {
        this.vehModelo = vehModelo;
    }

    public void setVehAño(JTextField vehAño) {
        this.vehAño = vehAño;
    }

    public void setVehCapacidad(JTextField vehCapacidad) {
        this.vehCapacidad = vehCapacidad;
    }

    public void setVehColor(JTextField vehColor) {
        this.vehColor = vehColor;
    }

    public void setVehKilometros(JTextField vehKilometros) {
        this.vehKilometros = vehKilometros;
    }
}
