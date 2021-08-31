/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.FI_Vehiculos;
import javax.swing.JInternalFrame;
import components.EntradasTextoFormularios;
import components.EtiquetasFormularios;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import util.SpringUtilities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

//importo al modelo de vehiculos para hacer la respectiva insercion de datos
import model.Vehiculo;

//importo al controlador de vehiculo
import controller.VehiculoController;
import javax.swing.JOptionPane;

/**
 *
 * @author Lau
 */
public class RegistroVehiculos{
    
    //formulario principal
    JInternalFrame vehiculoForm;
    
    //panel principal
    JPanel panel;
    
    //botones
    JButton RegistrarVeh, EditarVeh, EliminarVeh, MostrarVeh;
    
    //etiquetas
    EtiquetasFormularios etiquetas;
    
    //entradas de texto
    EntradasTextoFormularios entradas;
    
    //Creo una instancia para el controlador de vehiculos
    VehiculoController vehiculoControlador;
    
    public RegistroVehiculos(){
        //configuracion de la ventana
        vehiculoForm = new JInternalFrame();
        vehiculoForm.setTitle("Registro vehiculos");
        vehiculoForm.setSize(760, 450);
        vehiculoForm.setClosable(true);
        vehiculoForm.setMaximizable(true);
        
        //creo el panel principal
        panel = new JPanel(new SpringLayout()); //new SpringLayout() 
        
        //etiquetas
        etiquetas = new EtiquetasFormularios();
        //placa, marca, modelo, año, capacidad, color, kilometros
        //entradas de texto
        entradas = new EntradasTextoFormularios();
        
        //botones
        RegistrarVeh = new JButton("Registrar");
        
        //controlador
        vehiculoControlador = new VehiculoController();
        
        //etiquetas de vehiculo
        etiquetas.setPlaca(new JLabel("Placa"));
        etiquetas.setMarca(new JLabel("Marca"));
        etiquetas.setModelo(new JLabel("Modelo"));
        etiquetas.setAño(new JLabel("Año"));
        etiquetas.setCapacidad(new JLabel("Capacidad"));
        etiquetas.setColor(new JLabel("Color"));
        etiquetas.setKilometros(new JLabel("Kilometros"));
        
        //placa
        panel.add(etiquetas.getPlaca());
        panel.add(entradas.getTextFieldVehPlaca());
        
        //marca
        panel.add(etiquetas.getMarca());
        panel.add(entradas.getTextFieldVehMarca());
        //modelo
        panel.add(etiquetas.getModelo());
        panel.add(entradas.getTextFieldVehModelo());
        
        //año
        panel.add(etiquetas.getAño());
        panel.add(entradas.getTextFieldVehAño());
        
        //capacidad
        panel.add(etiquetas.getCapacidad());
        panel.add(entradas.getTextFieldVehCapacidad());
        
        //color
        panel.add(etiquetas.getColor());
        panel.add(entradas.getTextFieldVehColor());
        
        //kilometros
        panel.add(etiquetas.getKilometros());
        panel.add(entradas.getTextFieldVehKilometros());
        
        //botones
        //panel.add();
        
        //agrego todos los componentes a mi formulario principal
        //vehiculoForm.add(panel_principal);
        
        //eventos para los botones
        RegistrarVeh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String placa = entradas.getTextFieldVehPlaca().getText();
                String marca = entradas.getTextFieldVehMarca().getText();
                String modelo = entradas.getTextFieldVehModelo().getText();
                int año = Integer.parseInt(entradas.getTextFieldVehAño().getText());
                int capacidad = Integer.parseInt(entradas.getTextFieldVehCapacidad().getText());
                String color = entradas.getTextFieldVehColor().getText();
                int kilometraje = Integer.parseInt(entradas.getTextFieldVehKilometros().getText());
                Vehiculo vehiculo = new Vehiculo(placa, marca, modelo, año, capacidad, color, kilometraje);
                vehiculoControlador.agregarVehiculo(vehiculo);
                JOptionPane.showMessageDialog(null, "Registro creado de manera exitosa");
            }
        });
        //ubicacion de los paneles
        SpringUtilities.makeCompactGrid(panel, 
                                        7, 2, 
                                        20, 30,
                                        20, 20);
        
        //creo el panel principal
        JPanel panel_principal = new JPanel();
        
        //Paso el contenido del panel
        vehiculoForm.setContentPane(panel_principal);
        panel_principal.add(panel);
        //panel_principal.setBackground(Color.red);
        //panel.setBackground(Color.yellow);
        
        //ubicacion del panel
        //panel.setLayout(new FlowLayout(FlowLayout.TRAILING));
        
        //variables para pruebas
        
        
        //creo un panel nuevo para los botones
        JPanel panel_botones = new JPanel();
        
        panel_botones.add(RegistrarVeh);
        //panel_botones.setBackground(Color.green);
        panel_botones.setLocation(120, 0);
        panel_principal.add(panel_botones, BorderLayout.PAGE_END);
        
        //vehiculoForm.add(panel_principal, BorderLayout.CENTER);
        
    }

    public JInternalFrame getVehiculoForm() {
        return vehiculoForm;
    }
}
