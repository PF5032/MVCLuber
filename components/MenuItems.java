/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import javax.swing.JMenuItem;

/**
 *
 * @author Lau
 */
public class MenuItems extends JMenuItem{
    
    //items de cada entrada principal del menu
    JMenuItem Registrar_veh, Editar_veh, Eliminar_veh, Mostrar_veh
            ,Registrar_usu, Editar_usu, Eliminar_usu, Mostrar_usu
            ,Registrar_con, Editar_con, Eliminar_con, Mostrar_con
            ,Registrar_via, Editar_via, Eliminar_via, Mostrar_via;
    
    public MenuItems(){
        //ahora los items de esa opcion
        Registrar_veh = new JMenuItem("Registrar y Editar");
        Editar_veh = new JMenuItem("Editar vehiculos");
        Eliminar_veh = new JMenuItem("Eliminar vehiculos");
        Mostrar_veh = new JMenuItem("Editar y Mostrar");
        
        Registrar_usu = new JMenuItem("Registrar y Editar");
        Editar_usu = new JMenuItem("Editar vehiculos");
        Eliminar_usu = new JMenuItem("Eliminar vehiculos");
        Mostrar_usu = new JMenuItem("Eliminar y Mostrar");
        
        Registrar_con = new JMenuItem("Registrar y Editar");
        Editar_veh = new JMenuItem("Editar vehiculos");
        Eliminar_veh = new JMenuItem("Eliminar vehiculos");
        Mostrar_con = new JMenuItem("Eliminar y Mostrar");
        
        Registrar_via = new JMenuItem("Registrar y Editar");
        Editar_veh = new JMenuItem("Editar vehiculos");
        Eliminar_veh = new JMenuItem("Eliminar vehiculos");
        Mostrar_via = new JMenuItem("Eliminar y Mostrar");
    }

    public JMenuItem getRegistrar_veh() {
        return Registrar_veh;
    }

    public void setRegistrar_veh(JMenuItem Registrar_veh) {
        this.Registrar_veh = Registrar_veh;
    }

    public JMenuItem getEditar_veh() {
        return Editar_veh;
    }

    public void setEditar_veh(JMenuItem Editar_veh) {
        this.Editar_veh = Editar_veh;
    }

    public JMenuItem getEliminar_veh() {
        return Eliminar_veh;
    }

    public void setEliminar_veh(JMenuItem Eliminar_veh) {
        this.Eliminar_veh = Eliminar_veh;
    }

    public JMenuItem getMostrar_veh() {
        return Mostrar_veh;
    }

    public void setMostrar_veh(JMenuItem Mostrar_veh) {
        this.Mostrar_veh = Mostrar_veh;
    }

    public JMenuItem getRegistrar_usu() {
        return Registrar_usu;
    }

    public void setRegistrar_usu(JMenuItem Registrar_usu) {
        this.Registrar_usu = Registrar_usu;
    }

    public JMenuItem getEditar_usu() {
        return Editar_usu;
    }

    public void setEditar_usu(JMenuItem Editar_usu) {
        this.Editar_usu = Editar_usu;
    }

    public JMenuItem getEliminar_usu() {
        return Eliminar_usu;
    }

    public void setEliminar_usu(JMenuItem Eliminar_usu) {
        this.Eliminar_usu = Eliminar_usu;
    }

    public JMenuItem getMostrar_usu() {
        return Mostrar_usu;
    }

    public void setMostrar_usu(JMenuItem Mostrar_usu) {
        this.Mostrar_usu = Mostrar_usu;
    }

    public JMenuItem getRegistrar_con() {
        return Registrar_con;
    }

    public void setRegistrar_con(JMenuItem Registrar_con) {
        this.Registrar_con = Registrar_con;
    }

    public JMenuItem getEditar_con() {
        return Editar_con;
    }

    public void setEditar_con(JMenuItem Editar_con) {
        this.Editar_con = Editar_con;
    }

    public JMenuItem getEliminar_con() {
        return Eliminar_con;
    }

    public void setEliminar_con(JMenuItem Eliminar_con) {
        this.Eliminar_con = Eliminar_con;
    }

    public JMenuItem getMostrar_con() {
        return Mostrar_con;
    }

    public void setMostrar_con(JMenuItem Mostrar_con) {
        this.Mostrar_con = Mostrar_con;
    }

    public JMenuItem getRegistrar_via() {
        return Registrar_via;
    }

    public void setRegistrar_via(JMenuItem Registrar_via) {
        this.Registrar_via = Registrar_via;
    }

    public JMenuItem getEditar_via() {
        return Editar_via;
    }

    public void setEditar_via(JMenuItem Editar_via) {
        this.Editar_via = Editar_via;
    }

    public JMenuItem getEliminar_via() {
        return Eliminar_via;
    }

    public void setEliminar_via(JMenuItem Eliminar_via) {
        this.Eliminar_via = Eliminar_via;
    }

    public JMenuItem getMostrar_via() {
        return Mostrar_via;
    }

    public void setMostrar_via(JMenuItem Mostrar_via) {
        this.Mostrar_via = Mostrar_via;
    }
    
}
