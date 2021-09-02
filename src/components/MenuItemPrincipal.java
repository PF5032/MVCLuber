/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import javax.swing.JMenu;

/**
 *
 * @author Lau
 */
public class MenuItemPrincipal extends JMenu{
    //Entradas principales del menu
    JMenu Vehiculo_principal, Viaje_principal, Usuario_principal, 
            Conductor_principal;
    
    public MenuItemPrincipal(){
        Vehiculo_principal = new JMenu("Vehiculos");
    }

    public JMenu getVehiculo_principal() {
        return Vehiculo_principal;
    }

    public JMenu getViaje_principal() {
        return Viaje_principal;
    }

    public JMenu getUsuario_principal() {
        return Usuario_principal;
    }

    public JMenu getConductor_principal() {
        return Conductor_principal;
    }
    
}
