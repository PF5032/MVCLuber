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

public class Menu extends JMenuBar{
    
    //creo el menu y luego le agrego los respectivos items
    JMenuBar MenuPrincipal; //este es como el contenido principal
    JMenu Vehiculo, Viaje, Usuario, Conductor;//este es el item que va a tener el menu
    JMenuItem Registrar, Editar, Eliminar, Mostrar;
    JInternalFrame frame_interno;
    //JDesktopPane escritorio;
    JDesktopPane escritorio;
    //frame de registro
    FI registroVehiculos;
    
    public Menu() {
        //Aqui creo todo lo respectivo que tenga que ver con el menu
        //inicializamos la variable principal de nuestro menu
        MenuPrincipal = new JMenuBar();
        //setJMenuBar(MenuPrincipal);
        escritorio = new JDesktopPane();
        //Ahora agrego los items del menu
        Vehiculo = new JMenu("Vehiculo");
        
        //Agrego Vehiculo al menu
        MenuPrincipal.add(Vehiculo);
        
        //ahora los items de esa opcion
        Registrar = new JMenuItem("Registrar vehiculos");
        Editar = new JMenuItem("Editar vehiculos");
        Eliminar = new JMenuItem("Eliminar vehiculos");
        Mostrar = new JMenuItem("Mostrar vehiculos");
        
        //Los agrego a su respectivo apartado
        Vehiculo.add(Registrar);
        Vehiculo.add(Editar);
        Vehiculo.add(Eliminar);
        Vehiculo.add(Mostrar);
        
        //metodo de escucha para el formulario de registro
        Registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //JDesktopPane escritorio = new JDesktopPane();
                btnRegistro();
                System.out.println("*** alerta de prueba ***");
            }
        });
        
        //metodo de escucha para el formulario editar, eliminar, mostrar
        Editar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnEditar();
            }
        });
        
        Eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnEliminar();
            }
        });
        
        Mostrar.addActionListener(new ActionListener() {
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
            //frame_interno.setSize(760, 450); //un tamaño primario
            //frame_interno.setResizable(true);
            //frame_interno.setMaximizable(true); //para ampliar el frame interno
            //frame_interno.setClosable(true);
            //escritorio.add(frame_interno);
            //frame_interno.setVisible(true);
            */
            
            registroVehiculos = new FI();
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
