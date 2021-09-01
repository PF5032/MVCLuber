/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.VehiculoController;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.UIManager;
import util.SpringUtilities;

/**
 *
 * @author Lau
 */
/* el codigo que funciona bien
public class FrameVehiculo extends JFrame{
    //defino los campos de mi formulario
    JTextField textFieldVehPlaca;
    JTextField textFieldVehMarca;
    JTextField textFieldVehModelo;
    JTextField textFieldVehAnio;
    JTextField textFieldVehCapacidad;
    JTextField textFieldVehColor;
    JTextField textFieldVehKilometros;
    PanelVehiculos listadovehiculos;
    //llamo al controlador
    VehiculoController controller;
    
    FrameVehiculo(){
        controller = new VehiculoController();
        initComponents();
    }

    private void initComponents() {
        //al cerrar la ventana se finaliza la ejecucion del programa
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        //Establece el titulo de la ventana
        setTitle("Administracion Vehiculos");
        
        //Establece el aspecto de la distribucion utilizada
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
            e.printStackTrace();
        }
        
        //creo un panel
        JPanel panel_contenido = new JPanel(new SpringLayout());
        
        //creo lo que contendra el panel
        JLabel contenido = new JLabel("Placa", JLabel.TRAILING);
        panel_contenido.add(contenido);
        textFieldVehPlaca = new JTextField(6);
        contenido.setLabelFor(textFieldVehPlaca);
        panel_contenido.add(textFieldVehPlaca);
        
        contenido = new JLabel("Marca", JLabel.TRAILING);
        panel_contenido.add(contenido);
        textFieldVehMarca = new JTextField(10);
        contenido.setLabelFor(textFieldVehMarca);
        panel_contenido.add(textFieldVehMarca);//para agregar al panel principal
        
        contenido = new JLabel("Modelo", JLabel.TRAILING);
        panel_contenido.add(contenido);
        textFieldVehModelo = new JTextField(10);
        contenido.setLabelFor(textFieldVehModelo);
        panel_contenido.add(textFieldVehModelo);//para agregar al panel principal
        
        contenido = new JLabel("Año", JLabel.TRAILING);
        panel_contenido.add(contenido);
        textFieldVehAnio = new JTextField(10);
        contenido.setLabelFor(textFieldVehAnio);
        panel_contenido.add(textFieldVehAnio);//para agregar al panel principal
        
        contenido = new JLabel("Capacidad", JLabel.TRAILING);
        panel_contenido.add(contenido);
        textFieldVehCapacidad = new JTextField(10);
        contenido.setLabelFor(textFieldVehCapacidad);
        panel_contenido.add(textFieldVehCapacidad);//para agregar al panel principal
        
        contenido = new JLabel("Color", JLabel.TRAILING);
        panel_contenido.add(contenido);
        textFieldVehColor = new JTextField(10);
        contenido.setLabelFor(textFieldVehColor);
        panel_contenido.add(textFieldVehColor);//para agregar al panel principal
        
        contenido = new JLabel("Kilometros", JLabel.TRAILING);
        panel_contenido.add(contenido);
        textFieldVehKilometros = new JTextField(10);
        contenido.setLabelFor(textFieldVehKilometros);
        panel_contenido.add(textFieldVehKilometros);//para agregar al panel principal
        //Lay out the panel.
        SpringUtilities.makeCompactGrid(panel_contenido,
                                        7, 2, //rows, cols
                                        18, 18,        //initX, initY
                                        18, 18);       //xPad, yPad        

        JPanel panelPrincipal = new JPanel();
        
        setContentPane(panelPrincipal);
        panelPrincipal.add(panel_contenido);
        listadovehiculos = new PanelVehiculos(controller);
        JPanel panelBtn2 = new JPanel();
        JButton btnEditar = new JButton("Editar");
        panelBtn2.add(btnEditar);
        JButton btnEliminar = new JButton("Eliminar");
        panelBtn2.add(btnEliminar);
         
        
        panelPrincipal.add(listadovehiculos);
                
        pack();
        // Permite ubicar la ventana en el centro de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation((screenSize.width - frameSize.width) / 2, 
                (screenSize.height - frameSize.height) / 2);
        setVisible(true);
    }
    
    //agrego el metodo principal
    public static void main(String[] args){
        new FrameVehiculo();
    }

}*/
