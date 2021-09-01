package view.FI_Vehiculos;

import javax.swing.JInternalFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import util.SpringUtilities;

//imports de controlador y modelo
import controller.VehiculoController;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import model.Vehiculo;

/**
 *
 * @author JP
 */
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
        editarVehiculoForm.setSize(760, 450);
        editarVehiculoForm.setClosable(true);
        editarVehiculoForm.setMaximizable(true);
        //----------------------------------------
        
        controladorVehiculo = new VehiculoController();
        
        //llamo el formulario de registro para poder tener acceso a las entradas
        registroVehiculo = new RegistroVehiculos();
        
        //En este apartado es donde se muestra la tabla con el contenido de la tabla
        //vehiculos
        panel_vehiculos = new JPanel(new SpringLayout());
        tablaRegistroVehiculo = new JTable();
        setLayout(new BorderLayout());
        JScrollPane scroll = new JScrollPane(tablaRegistroVehiculo);
        add(scroll);
        //Cargo la consulta que esta en el controlador vehiculos
        //para poder llenar la tabla
        tablaRegistroVehiculo.setModel(controladorVehiculo.consultarVehiculos());
        
        //panel para contenido de vehiculos
        
        panel_vehiculos.add(tablaRegistroVehiculo);
        
        //creo el panel principal
        JPanel panel_principal = new JPanel();
        
        //Paso el contenido del panel
        editarVehiculoForm.setContentPane(panel_principal);
        panel_principal.add(tablaRegistroVehiculo);
        
        //panel para botones
        JPanel botones = new JPanel();
        JButton actualizar_datos = new JButton("Actualizar");
        botones.add(actualizar_datos);
        panel_principal.add(botones);
        //Agrego las entradas de texto del formulario de registro
        panel_principal.add(registroVehiculo.entradas.getTextFieldVehPlaca());
        panel_principal.add(registroVehiculo.entradas.getTextFieldVehMarca());
        panel_principal.add(registroVehiculo.entradas.getTextFieldVehModelo());
        panel_principal.add(registroVehiculo.entradas.getTextFieldVehAño());
        panel_principal.add(registroVehiculo.entradas.getTextFieldVehCapacidad());
        panel_principal.add(registroVehiculo.entradas.getTextFieldVehColor());
        panel_principal.add(registroVehiculo.entradas.getTextFieldVehKilometros());
        
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
                Vehiculo vehiculo = new Vehiculo(registroVehiculo.entradas.getTextFieldVehPlaca().getText(), 
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
