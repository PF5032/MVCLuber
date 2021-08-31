/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

//llamo al controlador
import controller.VehiculoController;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class PanelVehiculos extends JPanel{
    private JTable table;
    VehiculoController controller;
    
    public PanelVehiculos(VehiculoController controller){
        this.controller = controller;
        initComponents();
    }
    
    private void initComponents(){
        table = new JTable();
        setLayout(new BorderLayout());
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
        cargarVehiculos();
    }
    
    public void cargarVehiculos(){
        table.setModel(controller.consultarVehiculos());
    }
    
    public JTable getTable(){
        return table;
    }
}
