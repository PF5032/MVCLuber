package components;

import javax.swing.JMenuBar;

import view.FI_Vehiculos.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;

//  @return El metodo principal hereda de la clase JMenuBar
public class Menu extends JMenuBar{
    
    //  @return Creo el menu el cual va a contener las otras clases del mismo
    //  @see MenuPrincipal#menuItemPrincipal#menuItem
    JMenuBar MenuPrincipal;
    
    //  @return Mediante esta variable puedo obtener el acceso al respectivo item principal(contenedor principal)
    MenuItemPrincipal menuItemPrincipal;
    
    //  @return Ahora se entiende mejor, menuItems es un subitem del menu.
    //  @see Tenemos la clase MenuItemPrincipal#getVehiculo_principal#... (algunas de las 4 opciones).
    MenuItems menuItems;
    
    /*
        @return Importante por medio de esta variable es que puedo mostrar los formularios internos
                o llamados JInternalFrame, es un contenedor absoluto o el principal de la ventana.
    */
    JDesktopPane escritorio;
    
    //  @param Creo las 4 variables las cuales hacen referencia a los items de la seccion que los contiene
    RegistroVehiculos registroVehiculos;
    
    EditarVehiculos editarVehiculos;
    
    EliminarVehiculos eliminarVehiculos;
    
    ConsultarVehiculos consultarVehiculos;
    
    //  @return El metodo es el principal de la clase, nos devuelve el funcionamiento correcto del formulario.
    public Menu() {
        //  @param Inicializo el parametro de nuestro menu para poder ser visible, en el contenedor escritorio
        MenuPrincipal = new JMenuBar();
        
        //  @param Inicializo el contenedor principal del formulario, el encargado de mostrarnos todos los metodos graficos.
        escritorio = new JDesktopPane();
        
        //  @param Al igual que los anteriores parametros, inicio este ya que el metodo me saldra nulo, al no saber de donde se requiere enviar o recibir la informacion.
        menuItemPrincipal = new MenuItemPrincipal();
        
        //  @param Este parametro es para los formularios internos de la vista, el cual es contenido tambien por la seccion principal.
        menuItems = new MenuItems();
        
        /*
            @return Con el uso de MenuPrincipal.add llamo de menuItemPrincipal la seccion principal para los formularios.
        */
        MenuPrincipal.add(menuItemPrincipal.getVehiculo_principal());
        
        /*
          @param Mediante la variable ya definida de la clase MenuItemPrincipal dentro del paquete de components
                 la cual mediante el uso del metodo getVehiculo_principal().add accedemos a la variable
                 menuItems y poder mandar a llamar los formularios por su respectivo metodo get.
        */
        menuItemPrincipal.getVehiculo_principal().add(menuItems.getRegistrar_veh());
        menuItemPrincipal.getVehiculo_principal().add(menuItems.getEditar_veh());
        menuItemPrincipal.getVehiculo_principal().add(menuItems.getEliminar_veh());
        menuItemPrincipal.getVehiculo_principal().add(menuItems.getConsultar_veh());
        
        /*
            @return Los siguientes cuatro metodos, sirven para ir llamando cada formulario que esta dentro
                    de la seccion principal, ya que Menu llama a MenuItmePrincipal y por ultimo el MenuItems
                    donde estan nuestros formularios para ser usados.
        */
        menuItems.getRegistrar_veh().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnRegistro();
            }
        });
        
        menuItems.getEditar_veh().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnEditar();
            }
        });
        
        menuItems.getConsultar_veh().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnConsultar();
            }
        });
        
        menuItems.getEliminar_veh().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnEliminar();
            }
        });
    }
    /*
        @return El metodo nos devuelve el acceso al formulario interno de registrar vehiculos
                el cual esta ubicado en la vista, view.FI_VEHICULOS/RegistrarVehiculos
    */
    public void btnRegistro(){
        /*
            @throw En caso de que suceda un error, el metodo lanza un error indicando cual es el problema.
                    Lo mas por defecto es que sea un valor nulo por la falta de inicializacion de la variable.
        */
        try {
            registroVehiculos = new RegistroVehiculos();
            escritorio.add(registroVehiculos.getVehiculoForm());
            registroVehiculos.getVehiculoForm().setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /*
        @return El metodo nos devuelve el acceso al formulario interno de editar vehiculos
                el cual esta ubicado en la vista, view.FI_VEHICULOS/EditarVehiculos
    */
    public void btnEditar(){
        /*
            @throw En caso de que suceda un error, el metodo lanza un error indicando cual es el problema.
                    Lo mas por defecto es que sea un valor nulo por la falta de inicializacion de la variable.
        */
        try{
            editarVehiculos = new EditarVehiculos();
            escritorio.add(editarVehiculos.getEditarVehiculoForm());
            editarVehiculos.getEditarVehiculoForm().setVisible(true);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    /*
        @return El metodo nos devuelve el acceso al formulario interno de eliminar vehiculos
                el cual esta ubicado en la vista, view.FI_VEHICULOS/EliminarVehiculos
    */
    public void btnEliminar(){
        /*
            @throw En caso de que suceda un error, el metodo lanza un error indicando cual es el problema.
                    Lo mas por defecto es que sea un valor nulo por la falta de inicializacion de la variable.
        */
        try{
            eliminarVehiculos = new EliminarVehiculos();
            escritorio.add(eliminarVehiculos.getEliminarVehiculoForm());
            eliminarVehiculos.getEliminarVehiculoForm().setVisible(true);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    /*
        @return El metodo nos devuelve el acceso al formulario interno de consultar vehiculos
                el cual esta ubicado en la vista, view.FI_VEHICULOS/ConsultarVehiculos
    */
    public void btnConsultar(){
        /*
            @throw En caso de que suceda un error, el metodo lanza un error indicando cual es el problema.
                    Lo mas por defecto es que sea un valor nulo por la falta de inicializacion de la variable.
        */
        try{
            consultarVehiculos = new ConsultarVehiculos();
            escritorio.add(consultarVehiculos.getConsultarVehiculo());
            consultarVehiculos.getConsultarVehiculo().setVisible(true);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    /*
        @return Tambien debo de crear un metodo para tener acceso al menu desde mi formulario principal
                y poder mostrar la informacion que quiero colocar dentro del mismo.
    */
    public JMenuBar getMenuPrincipal() {
        return MenuPrincipal;
    }
    
    /*
        @return Por medio de este metodo puedo obtener acceso a esta clase y poder llamar 
                a mi panel de escritorio desde el formulario principal.
    */
    public JDesktopPane getEscritorio() {
        return escritorio;
    }
    
}
