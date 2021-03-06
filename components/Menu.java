/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import view.FI_Vehiculos.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import components.MenuItemPrincipal;
import components.MenuItems;

public class Menu extends JMenuBar{
    
    //creo el menu y luego le agrego los respectivos items
    JMenuBar MenuPrincipal; //este es como el contenido principal
    
    //traigo los items principales del menu
    MenuItemPrincipal menuItemPrincipal;
    
    //traigo los items de la clase MenuItems
    MenuItems menuItems;
    
    //JDesktopPane escritorio;
    JDesktopPane escritorio;
    //frame de registro
    RegistroVehiculos registroVehiculos;
    
    public Menu() {
        //Aqui creo todo lo respectivo que tenga que ver con el menu
        //inicializamos la variable principal de nuestro menu
        MenuPrincipal = new JMenuBar();
        //setJMenuBar(MenuPrincipal);
        escritorio = new JDesktopPane();
        
        //para las entradas principales del menu
        menuItemPrincipal = new MenuItemPrincipal();
        
        //para los items de la entrada principal
        menuItems = new MenuItems();
        
        //Agrego los items al menu principal
        MenuPrincipal.add(menuItemPrincipal.getVehiculo_principal());
        MenuPrincipal.add(menuItemPrincipal.getUsuario_principal());
        MenuPrincipal.add(menuItemPrincipal.getConductor_principal());
        MenuPrincipal.add(menuItemPrincipal.getViaje_principal());
        
        //Agrego los items a la opcion principal
        menuItemPrincipal.getVehiculo_principal().add(menuItems.getRegistrar_veh());
        menuItemPrincipal.getVehiculo_principal().add(menuItems.getEditar_veh());
        menuItemPrincipal.getVehiculo_principal().add(menuItems.getEliminar_veh());
        menuItemPrincipal.getVehiculo_principal().add(menuItems.getMostrar_veh());
        
        /*Usuario_principal.add(Registrar_usu);
        Usuario_principal.add(Mostrar_usu);
        
        Conductor_principal.add(Registrar_con);
        Conductor_principal.add(Mostrar_con);
        
        Viaje_principal.add(Registrar_via);
        Viaje_principal.add(Mostrar_via);*/
        
        //metodo de escucha para el formulario de registro
        menuItems.getRegistrar_veh().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //JDesktopPane escritorio = new JDesktopPane();
                btnRegistro();
                System.out.println("*** alerta de prueba ***");
            }
        });
        
        //metodo de escucha para el formulario editar, eliminar, mostrar
       /* Editar_veh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnEditar();
            }
        });
        
        Eliminar_veh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnEliminar();
            }
        });*/
        
        menuItems.getMostrar_veh().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnMostrar();
            }
        });
    }
    
    public void btnRegistro(){
        try {
            /* codigo prueba
            //frame_interno = new JInternalFrame();
            //frame_interno.setTitle("Data"); //el titulo del frame interno
            //frame_interno.setSize(760, 450); //un tama??o primario
            //frame_interno.setResizable(true);
            //frame_interno.setMaximizable(true); //para ampliar el frame interno
            //frame_interno.setClosable(true);
            //escritorio.add(frame_interno);
            //frame_interno.setVisible(true);
            */
            
            registroVehiculos = new RegistroVehiculos();
            registroVehiculos.getVehiculoForm();
            escritorio.add(registroVehiculos.getVehiculoForm());
            registroVehiculos.getVehiculoForm().setVisible(true);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //metofo para editar
    public void btnEditar(){
        try{
            /*editarVehiculos = new FI_Editar();
            editarVehiculos.getEditarVehiculos();
            escritorio.add(editarVehiculos.getEditarVehiculos());
            editarVehiculos.getEditarVehiculos().setVisible(true);*/
        } catch(Exception ex){
            ex.printStackTrace();
        }
    
    }
    
    public void btnEliminar(){
        try{
            /*eliminarVehiculos = new FI_Eliminar();
            eliminarVehiculos.getEliminarVehiculos();
            escritorio.add(eliminarVehiculos.getEliminarVehiculos());
            eliminarVehiculos.getEliminarVehiculos().setVisible(true);*/
        } catch(Exception ex){
            ex.printStackTrace();
        }
    
    }
    
    public void btnMostrar(){
        try{
            /*mostrarVehiculos = new FI_Mostrar();
            mostrarVehiculos.getMostrarVehiculos();
            escritorio.add(mostrarVehiculos.getMostrarVehiculos());
            mostrarVehiculos.getMostrarVehiculos().setVisible(true);*/
        } catch(Exception ex){
            ex.printStackTrace();
        }
    
    }
    
    //metodos para el formulario principal
    
    //---- menu principal
    public JMenuBar getMenuPrincipal() {
        return MenuPrincipal;
    }
    // --------
    
    //------ Panel de escritorio
    public JDesktopPane getEscritorio() {
        return escritorio;
    }
    // ----------

    
    
}
