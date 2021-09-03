package components;

import javax.swing.JMenu;

/**
 *
 * @author Juan Pablo S.
 */

public class MenuItemPrincipal extends JMenu{
    //  @param Creo los parametros o variables para el Itemprincipal, el cual contendra los menuItems
    //  @see de la clase MenuItems
    JMenu Vehiculo_principal;
    
    //  @return Esto solo nos creara y traera un componente principal para nuestros items
    public MenuItemPrincipal(){
        Vehiculo_principal = new JMenu("Vehiculos");
    }
    
    //  @return El metodo nos devolvera el acceso al componente principal, el que carga el respectivo item
    //  @see MenuItems#Registrar_veh, MenuItems#Editar_veh, MenuItems#Eliminar_veh, MenuItems#Consultar_veh
    public JMenu getVehiculo_principal() {
        return Vehiculo_principal;
    }
}
