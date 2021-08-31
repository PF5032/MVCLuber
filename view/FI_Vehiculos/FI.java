/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.FI_Vehiculos;
import javax.swing.JInternalFrame;
import components.EntradasTexto;
import components.Etiquetas;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import util.SpringUtilities;
import components.Botones;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Lau
 */
public class FI{
    
    //formulario principal
    JInternalFrame vehiculoForm;
    
    //panel principal
    JPanel panel;
    
    //etiquetas
    Etiquetas etiquetas;
    
    //entradas de texto
    EntradasTexto entradas;
    
    //botones
    Botones boton_registrar;
    
    public FI(){
        //configuracion de la ventana
        vehiculoForm = new JInternalFrame();
        vehiculoForm.setTitle("Registro vehiculos");
        vehiculoForm.setSize(760, 450);
        vehiculoForm.setClosable(true);
        vehiculoForm.setMaximizable(true);
        
        //creo el panel principal
        panel = new JPanel(new SpringLayout());
        
        //etiquetas
        etiquetas = new Etiquetas();
        //placa, marca, modelo, año, capacidad, color, kilometros
        //entradas de texto
        entradas = new EntradasTexto();
        
        //botones
        boton_registrar = new Botones();
        
        //etiquetas de vehiculo
        etiquetas.setPlaca(new JLabel("Placa"));
        etiquetas.setMarca(new JLabel("Marca"));
        etiquetas.setModelo(new JLabel("Modelo"));
        etiquetas.setAño(new JLabel("Año"));
        etiquetas.setCapacidad(new JLabel("Capacidad"));
        etiquetas.setColor(new JLabel("Color"));
        etiquetas.setKilometros(new JLabel("Kilometros"));
        
        //boton registrar
        boton_registrar.setDefaultButtonRegistrar(new JButton("Registrar"));
        
        //placa
        panel.add(etiquetas.getPlaca());
        panel.add(entradas.getVehPlaca());
        
        //marca
        panel.add(etiquetas.getMarca());
        panel.add(entradas.getVehMarca());
        //modelo
        panel.add(etiquetas.getModelo());
        panel.add(entradas.getVehModelo());
        
        //año
        panel.add(etiquetas.getAño());
        panel.add(entradas.getVehAño());
        
        //capacidad
        panel.add(etiquetas.getCapacidad());
        panel.add(entradas.getVehCapacidad());
        
        //color
        panel.add(etiquetas.getColor());
        panel.add(entradas.getVehColor());
        
        //kilometros
        panel.add(etiquetas.getKilometros());
        panel.add(entradas.getVehKilometros());
        
        //botones
        //panel.add(boton_registrar);
        
        //agrego todos los componentes a mi formulario principal
        //vehiculoForm.add(panel_principal);
        
        SpringUtilities.makeCompactGrid(panel, 
                                        7, 2, 
                                        10, 6,
                                        6, 6);
        //creo el panel principal
        JPanel panel_principal = new JPanel();
        
        //Paso el contenido del panel
        vehiculoForm.setContentPane(panel_principal);
        panel_principal.add(panel);
        
        //variables para pruebas
        
        
        //creo un panel nuevo para los botones
        JPanel panel_botones = new JPanel();
        panel_botones.add(boton_registrar.getDefaultButtonRegistrar());
        panel_principal.add(panel_botones, BorderLayout.PAGE_END);
        //vehiculoForm.add(panel_principal, BorderLayout.CENTER);
        
    }

    public JInternalFrame getVehiculoForm() {
        return vehiculoForm;
    }

}
