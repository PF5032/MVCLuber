package view.FI_Vehiculos;

import components.EtiquetasFormularios;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

//imports de controlador y modelo
import controller.VehiculoController;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.VehiculoModel;

public class EditarVehiculos extends JInternalFrame{
    
    JInternalFrame editarVehiculoForm;
    JTable tablaRegistroVehiculo;
    VehiculoController controladorVehiculo;
    JPanel panel_vehiculos, panel_contenedor;
    RegistroVehiculos registroVehiculo;
    
    public EditarVehiculos(){
        //Configuracion de frame
        editarVehiculoForm = new JInternalFrame();
        editarVehiculoForm.setTitle("Editar Vehiculo");
        editarVehiculoForm.setSize(760, 525);
        editarVehiculoForm.setClosable(true);
        //----------------------------------------
        
        controladorVehiculo = new VehiculoController();
        
        //llamo el formulario de registro para poder tener acceso a las entradas
        registroVehiculo = new RegistroVehiculos();
        
        //En este apartado es donde se muestra la tabla con el contenido de la tabla
        //vehiculos
        panel_vehiculos = new JPanel(new BorderLayout());
        tablaRegistroVehiculo = new JTable();
        setLayout(new BorderLayout());
        JScrollPane scroll = new JScrollPane(tablaRegistroVehiculo);
        add(scroll);
        //nombres de la tabla
        tablaRegistroVehiculo.setToolTipText("Registro vehiculos");
        
        //Cargo la consulta que esta en el controlador vehiculos
        //para poder llenar la tabla
        tablaRegistroVehiculo.setModel(controladorVehiculo.consultarVehiculos());
        
        panel_vehiculos.add(new JLabel("Actualizar informacion vehiculo "), BorderLayout.PAGE_START);
        //panel para contenido de la tabla vehiculos
        panel_vehiculos.add(tablaRegistroVehiculo, BorderLayout.CENTER);
        panel_vehiculos.add(new JScrollPane(tablaRegistroVehiculo));
        //creo el panel principal
        JPanel panel_principal = new JPanel();
        
        //panel para las entradas de texto
        JPanel entradaInformacion = new JPanel(new GridLayout(7, 2));
        entradaInformacion.add(registroVehiculo.etiquetas.getPlaca());
        entradaInformacion.add(registroVehiculo.entradas.getTextFieldVehPlaca());
        entradaInformacion.add(registroVehiculo.etiquetas.getMarca());
        entradaInformacion.add(registroVehiculo.entradas.getTextFieldVehMarca());
        entradaInformacion.add(registroVehiculo.etiquetas.getModelo());
        entradaInformacion.add(registroVehiculo.entradas.getTextFieldVehModelo());
        entradaInformacion.add(registroVehiculo.etiquetas.getAño());
        entradaInformacion.add(registroVehiculo.entradas.getTextFieldVehAño());
        entradaInformacion.add(registroVehiculo.etiquetas.getCapacidad());
        entradaInformacion.add(registroVehiculo.entradas.getTextFieldVehCapacidad());
        entradaInformacion.add(registroVehiculo.etiquetas.getColor());
        entradaInformacion.add(registroVehiculo.entradas.getTextFieldVehColor());
        entradaInformacion.add(registroVehiculo.etiquetas.getKilometros());
        entradaInformacion.add(registroVehiculo.entradas.getTextFieldVehKilometros());
        
        //panel para botones
        JPanel botones = new JPanel(new BorderLayout());
        JButton actualizar_datos = new JButton("Actualizar");
        botones.add(actualizar_datos, BorderLayout.NORTH);
        
        //panel_vehiculos.add(botones, BorderLayout.SOUTH);
        
        //Paso el contenido del panel
        editarVehiculoForm.setContentPane(panel_principal);
        panel_principal.add(panel_vehiculos);
        panel_principal.add(entradaInformacion);
        panel_principal.add(botones);
        //Agrego el nuevo panel creado con las entradas
        //panel_vehiculos.add(entradaInformacion, BorderLayout.CENTER);
        
        tablaRegistroVehiculo.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                int fila_seleccionada = tablaRegistroVehiculo.getSelectedRow();
                if (fila_seleccionada != -1) {
                    registroVehiculo.entradas.getTextFieldVehPlaca().setText((String) tablaRegistroVehiculo.getValueAt(fila_seleccionada, 0));
                    registroVehiculo.entradas.getTextFieldVehMarca().setText((String) tablaRegistroVehiculo.getValueAt(fila_seleccionada, 1));
                    registroVehiculo.entradas.getTextFieldVehModelo().setText((String) tablaRegistroVehiculo.getValueAt(fila_seleccionada, 2));
                    registroVehiculo.entradas.getTextFieldVehAño().setText((String) tablaRegistroVehiculo.getValueAt(fila_seleccionada, 3));
                    registroVehiculo.entradas.getTextFieldVehCapacidad().setText((String) tablaRegistroVehiculo.getValueAt(fila_seleccionada, 4));
                    registroVehiculo.entradas.getTextFieldVehColor().setText((String) tablaRegistroVehiculo.getValueAt(fila_seleccionada, 5));
                    registroVehiculo.entradas.getTextFieldVehKilometros().setText((String) tablaRegistroVehiculo.getValueAt(fila_seleccionada, 6));
                }
            }
        });
        //evento de editar
        actualizar_datos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println(registroVehiculo.entradas.getTextFieldVehPlaca().getText());
                try{
                VehiculoModel vehiculo = new VehiculoModel(registroVehiculo.entradas.getTextFieldVehPlaca().getText(), 
                        registroVehiculo.entradas.getTextFieldVehMarca().getText(), 
                        registroVehiculo.entradas.getTextFieldVehModelo().getText(), 
                        Integer.parseInt(registroVehiculo.entradas.getTextFieldVehAño().getText()), 
                        Integer.parseInt(registroVehiculo.entradas.getTextFieldVehCapacidad().getText()),
                        registroVehiculo.entradas.getTextFieldVehColor().getText(),
                        Integer.parseInt(registroVehiculo.entradas.getTextFieldVehKilometros().getText()));
                controladorVehiculo.actualizarVehiculo(vehiculo);
                //Despues de actualizar, vuelvo a cargar el modelo en la tabla, para hacer un autorefresh
                tablaRegistroVehiculo.setModel(controladorVehiculo.consultarVehiculos());
                JOptionPane.showMessageDialog(null, "El registro con la placa " + registroVehiculo.entradas.getTextFieldVehPlaca().getText() + " se edito de manera exitosa");
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(rootPane, "Error : " + ex.getCause());
                }
            }
        });
    }

    public JInternalFrame getEditarVehiculoForm() {
        return editarVehiculoForm;
    }
}

/*
Codigo que alguna vez se uso

esto iba en el panel principal del formulario
panel_principal.add(registroVehiculo.entradas.getTextFieldVehPlaca());
        panel_principal.add(registroVehiculo.entradas.getTextFieldVehMarca());
        panel_principal.add(registroVehiculo.entradas.getTextFieldVehModelo());
        panel_principal.add(registroVehiculo.entradas.getTextFieldVehAño());
        panel_principal.add(registroVehiculo.entradas.getTextFieldVehCapacidad());
        panel_principal.add(registroVehiculo.entradas.getTextFieldVehColor());
        panel_principal.add(registroVehiculo.entradas.getTextFieldVehKilometros());

*/