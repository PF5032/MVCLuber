/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.FI_Vehiculos;

import components.EntradasTextoFormularios;
import components.EtiquetasFormularios;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.VehiculoController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import model.VehiculoModel;

/**
 *
 * @author Lau
 */
public class ConsultarVehiculos extends JInternalFrame{
    
    //Formulario principal
    JInternalFrame consultarVehiculo;
    
    //Etiqueta llamada de su respectiva clase
    EtiquetasFormularios etiquetas_formulario;
    
    //Entradas para nuestro formulario
    EntradasTextoFormularios entradas_formulario;
    
    //controlador de vehiculo
    VehiculoController controladorVehiculo;
    
    public ConsultarVehiculos(){
        initComponents();
    }
    
    private void initComponents() {
        consultarVehiculo = new JInternalFrame();
        consultarVehiculo.setTitle("Consultar datos vehiculo");
        consultarVehiculo.setSize(760, 450);
        consultarVehiculo.setClosable(true);
        consultarVehiculo.setMaximizable(true);
        //--------------------------------------------------------
        //defino las respectivas etiquetas para poder usarlas
        etiquetas_formulario = new EtiquetasFormularios();
        
        //defino la entrada para mi formulario de consulta
        entradas_formulario = new EntradasTextoFormularios();
        
        //defino la variable la cual va a tener nuestro controlador
        controladorVehiculo = new VehiculoController();
        
         //Creo un panel principal
         JPanel panel_contenedor = new JPanel(new BorderLayout());
         
        //Creo otro panel para contener nuestro objetos -> despues le doy otra definicion a esto
         JPanel panel_datos = new JPanel(new FlowLayout());
                 
         //llamaos a nuestra etiqueta y le asignamos un nombre
         etiquetas_formulario.setBuscar_datos(new JLabel("Buscar vehiculo"));
         
         JButton consultar = new JButton("Consultar");
         panel_datos.add(etiquetas_formulario.getBuscar_datos(), BorderLayout.LINE_START);
         panel_datos.add(entradas_formulario.getTextFieldConsultar_datos(), BorderLayout.PAGE_START);
         panel_datos.add(consultar, BorderLayout.LINE_END);
         
         //creo la tabla la cual va a traer los datos
         JTable tablaConsultaVehiculo = new JTable();
         setLayout(new BorderLayout());
         JScrollPane llenado = new JScrollPane(tablaConsultaVehiculo);
         tablaConsultaVehiculo.setModel(controladorVehiculo.consultarVehiculos());
         
         panel_contenedor.add(panel_datos);
         panel_datos.add(tablaConsultaVehiculo);
         //lo agrego al formulario
         consultarVehiculo.setContentPane(panel_contenedor);
         TableRowSorter trs;
         trs = new TableRowSorter<>(controladorVehiculo.consultarVehiculos());
         tablaConsultaVehiculo.setRowSorter(trs);
         entradas_formulario.getTextFieldConsultar_datos().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(entradas_formulario.getTextFieldConsultar_datos().getText(), 0));
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(entradas_formulario.getTextFieldConsultar_datos().getText(), 0));
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(entradas_formulario.getTextFieldConsultar_datos().getText(), 0));
            }
        });
    }
    public JInternalFrame getConsultarVehiculo() {
        return consultarVehiculo;
    }
}
