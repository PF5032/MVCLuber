package components;

import javax.swing.JMenuItem;

/**
 *
 * @author Juan Camilo Quevedo
 */
public class MenuItems extends JMenuItem{
    
    //  @param Definimos los parametros que luego seran definidos para nuestro componente JMenuItem
    JMenuItem Registrar_veh, Editar_veh, Eliminar_veh, Consultar_veh;
    
    /*
        @see El metodo MenuItems hace referencia o su uso es principal en la clase MenuItemPrincipal
    */
    
    public MenuItems(){
        // @param Registrar, editar, eliminar y consultar 
        // @return Son los encargados de responder el llamado de la clase MenuItemPrincipal
        Registrar_veh = new JMenuItem("Registrar vehiculo");
        Editar_veh = new JMenuItem("Editar vehiculos");
        Eliminar_veh = new JMenuItem("Eliminar vehiculos");
        Consultar_veh = new JMenuItem("Consultar vehiculos");
    }
    
    //  @return Obtiene el item que es el encargado de cargar correctamente el formulario de registrar vehiculo
    public JMenuItem getRegistrar_veh() {
        return Registrar_veh;
    }
    //  @return Por medio de este metodo podemos llamarlo desde la clase principal del menu para poder cambiar el nombre
    public void setRegistrar_veh(JMenuItem Registrar_veh) {
        this.Registrar_veh = Registrar_veh;
    }
    //  @return Obtiene el item que es el encargado de cargar correctamente el formulario de editar vehiculo
    public JMenuItem getEditar_veh() {
        return Editar_veh;
    }
    //  @return Sirve para cambiarle el nombre al item y obtener uno nuevo
    public void setEditar_veh(JMenuItem Editar_veh) {
        this.Editar_veh = Editar_veh;
    }
    //  @return Obtiene el item que es el encargado de cargar correctamente el formulario de eliminar vehiculo
    public JMenuItem getEliminar_veh() {
        return Eliminar_veh;
    }
    //  @return Sirve para cambiarle el nombre al item y obtener uno nuevo
    public void setEliminar_veh(JMenuItem Eliminar_veh) {
        this.Eliminar_veh = Eliminar_veh;
    }
    //  @return Obtiene el item que es el encargado de cargar correctamente el formulario de consultar vehiculo
    public JMenuItem getConsultar_veh() {
        return Consultar_veh;
    }
    //  @return Sirve para cambiarle el nombre al item y obtener uno nuevo
    public void setConsultar_veh(JMenuItem Mostrar_veh) {
        this.Consultar_veh = Mostrar_veh;
    }
}
