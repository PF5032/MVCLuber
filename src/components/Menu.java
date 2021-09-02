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
    
    //frame para editar
    EditarVehiculos editarVehiculos;
    
    //frame para eliminar
    EliminarVehiculos eliminarVehiculos;
    
    //frame consultar vehiculos
    ConsultarVehiculos consultarVehiculos;
    
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
        
        //Agrego los items a la opcion principal
        menuItemPrincipal.getVehiculo_principal().add(menuItems.getRegistrar_veh());
        menuItemPrincipal.getVehiculo_principal().add(menuItems.getEditar_veh());
        menuItemPrincipal.getVehiculo_principal().add(menuItems.getEliminar_veh());
        menuItemPrincipal.getVehiculo_principal().add(menuItems.getConsultar_veh());
        
        //metodo de escucha para el formulario de registro
        menuItems.getRegistrar_veh().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //JDesktopPane escritorio = new JDesktopPane();
                btnRegistro();
                System.out.println("*** alerta de prueba ***");
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
    
    public void btnRegistro(){
        try {
            registroVehiculos = new RegistroVehiculos();
            registroVehiculos.getVehiculoForm();
            escritorio.add(registroVehiculos.getVehiculoForm());
            registroVehiculos.getVehiculoForm().setVisible(true);
            //editarVehiculos.getEditarVehiculoForm().dispose();
            //eliminarVehiculos.getEliminarVehiculoForm().dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //metofo para editar
    public void btnEditar(){
        try{
            editarVehiculos = new EditarVehiculos();
            editarVehiculos.getEditarVehiculoForm();
            escritorio.add(editarVehiculos.getEditarVehiculoForm());
            editarVehiculos.getEditarVehiculoForm().setVisible(true);
            //registroVehiculos.getVehiculoForm().dispose();
            //eliminarVehiculos.getEliminarVehiculoForm().dispose();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void btnEliminar(){
        try{
            eliminarVehiculos = new EliminarVehiculos();
            eliminarVehiculos.getEliminarVehiculoForm();
            escritorio.add(eliminarVehiculos.getEliminarVehiculoForm());
            eliminarVehiculos.getEliminarVehiculoForm().setVisible(true);
            //editarVehiculos.getEditarVehiculoForm().dispose();
            //registroVehiculos.getRegistroVehiculos().dispose();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void btnConsultar(){
        try{
            consultarVehiculos = new ConsultarVehiculos();
            escritorio.add(consultarVehiculos.getConsultarVehiculo());
            consultarVehiculos.getConsultarVehiculo().setVisible(true);
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
