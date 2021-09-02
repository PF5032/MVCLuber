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
    JMenuItem Registrar_veh, Editar_veh, Eliminar_veh, Consultar_veh;
    
    public MenuItems(){
        //ahora los items de esa opcion
        Registrar_veh = new JMenuItem("Registrar vehiculo");
        Editar_veh = new JMenuItem("Editar vehiculos");
        Eliminar_veh = new JMenuItem("Eliminar vehiculos");
        Consultar_veh = new JMenuItem("Consultar vehiculos");
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

    public JMenuItem getConsultar_veh() {
        return Consultar_veh;
    }

    public void setConsultar_veh(JMenuItem Mostrar_veh) {
        this.Consultar_veh = Mostrar_veh;
    }
}
