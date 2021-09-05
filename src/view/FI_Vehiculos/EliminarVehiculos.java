package view.FI_Vehiculos;

import javax.swing.JInternalFrame;
import javax.swing.JTable;

//importaciones de controlador
import controller.VehiculoController;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import components.EtiquetasFormularios;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author JP
 */
public class EliminarVehiculos extends JInternalFrame{
    
    //Frame interno principal de nuestra clase
    JInternalFrame eliminarVehiculoForm;
    
    //Creo una variable para el controlador, el cual nos va a servir para invocar los datos
    VehiculoController controladorVehiculo;
    
    //Creo la variable para nuestro panel contenedor
    JPanel panel_contenido_eliminar;
    
    //La tabla que nos trae los datos
    JTable tablaEliminarVehiculos;
    
    //etiquetas para el formulario de eliminar
    EtiquetasFormularios etiquetas_informacion;
    
    public EliminarVehiculos(){
        //Configuracion de nuestro formulario interno
        eliminarVehiculoForm = new JInternalFrame();
        eliminarVehiculoForm.setTitle("Eliminar vehiculos");
        eliminarVehiculoForm.setSize(760, 520);
        eliminarVehiculoForm.setClosable(true);
        
        //instancio el controlador de vehiculo
        controladorVehiculo = new VehiculoController();
        
        //Creo el panel para contener nuestra tabla con los datos
        panel_contenido_eliminar = new JPanel();
        //Creo la tabla que me va a listar todo el contenido de la tabla vehiculos
         tablaEliminarVehiculos = new JTable();
         setLayout(new BorderLayout()); //esto lo tengo que buscar
         JScrollPane contenido_scroll = new JScrollPane(tablaEliminarVehiculos); //buscar sobre scrollpane
         add(contenido_scroll);
         
        //Cargo el data del controlador vehiculo
        tablaEliminarVehiculos.setModel(controladorVehiculo.consultarVehiculos());
        
        //Agrego el panel para el contenido de la tabla que nos llenara el controlador
        panel_contenido_eliminar.add(tablaEliminarVehiculos);
         
        //defino a panel_contenido_eliminar como el principal del formulario
        eliminarVehiculoForm.setContentPane(panel_contenido_eliminar);
        
        //informacion
        JLabel informacion = new JLabel("El registro se elimina con solo seleccionar la fila que desee");
        informacion.setForeground(Color.red);
        panel_contenido_eliminar.add(informacion);
        panel_contenido_eliminar.add(new JScrollPane(tablaEliminarVehiculos));
        
        //Creo el evento de selecciona en la tabla
        //Lo que hace es que al ser seleccionada una fila de la tabla, esta pueda eliminarse sin necesidad de tener un boton para hacerlo
        tablaEliminarVehiculos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                 int fila_seleccionada_eliminar = tablaEliminarVehiculos.getSelectedRow();
                 //si la fila seleccionada tiene informacion
                 if(fila_seleccionada_eliminar != -1){
                     //Meto esto dentro de un try para tener como mas control por si sale un error
                     try{
                        controladorVehiculo.eliminarVehiculo((String) tablaEliminarVehiculos.getValueAt(fila_seleccionada_eliminar, 0));
                        //Llamo de nuevo la consulta para listar los vehiculos para ver si surgio algun efecto con la consulta en la tabla
                        tablaEliminarVehiculos.setModel(controladorVehiculo.consultarVehiculos());
                     } catch(Exception ex){
                         JOptionPane.showMessageDialog(null, "Error : " + ex.getCause());
                     }
                 }
            }
        });
    }
    
    //metodo para ser llamado al item correspondiente en el menu
    public JInternalFrame getEliminarVehiculoForm() {
        return eliminarVehiculoForm;
    }
}
