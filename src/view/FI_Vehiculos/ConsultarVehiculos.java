package view.FI_Vehiculos;

import components.EntradasTextoFormularios;
import components.EtiquetasFormularios;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.VehiculoController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

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
         
        //Creo otro panel para la tabla, que mostrara los viajes (ojala no tire error)
        JPanel panel_datos_viaje = new JPanel(new BorderLayout());
        
         //llamaos a nuestra etiqueta y le asignamos un nombre
         etiquetas_formulario.setBuscar_datos(new JLabel("Buscar vehiculo"));
         
         panel_datos.add(etiquetas_formulario.getBuscar_datos(), BorderLayout.LINE_START);
         panel_datos.add(entradas_formulario.getTextFieldConsultar_datos(), BorderLayout.PAGE_START);
         
         
         //creo la tabla la cual va a traer los datos
         JTable tablaConsultaVehiculo = new JTable();
         setLayout(new BorderLayout());
         JScrollPane barra_deslizable = new JScrollPane(tablaConsultaVehiculo);
         tablaConsultaVehiculo.setModel(controladorVehiculo.consultarVehiculos());
         
        //Creo la tabla con los resultados de mi busqueda
        JTable tablaConsultaViajesVehiculo = new JTable();
        setLayout(new BorderLayout());
        JScrollPane contenedor_tabla = new JScrollPane(tablaConsultaViajesVehiculo);
         tablaConsultaViajesVehiculo.setModel(controladorVehiculo.consultarVehiculos());
         panel_contenedor.add(panel_datos);
         panel_datos.add(panel_datos_viaje, BorderLayout.SOUTH);
         panel_datos.add(new JScrollPane(tablaConsultaVehiculo));
         //lo agrego al formulario
         consultarVehiculo.setContentPane(panel_contenedor);
        
         //creo el respectivo evento para poder buscar sin necesidad de usar un boton
         entradas_formulario.getTextFieldConsultar_datos().addKeyListener(new KeyListener() {
            
            @Override
            public void keyPressed(KeyEvent ke) { //solo es de relleno, me los genera el netbeans.           
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                //defino una variable llamada caracter del evento del textfield
                //la cual me sirve para analizar cada caracter que se ingresa en el campo
                char caracter = ke.getKeyChar();
                //creo la respectiva validacion para la tabla y el campo de texto
                if(Character.isUpperCase(caracter)){ //verifico si el caracter ingresado es una mayuscula
                    //En caso de serlo muestra la tabla con los datos respectivos a la placa que se ingreso
                    //Se buscan coincidencias.
                    tablaConsultaVehiculo.setModel(controladorVehiculo.buscarVehiculos(entradas_formulario.getTextFieldConsultar_datos().getText()));
                    //el siguiente if es para verificar que no haya conflicto con la tecla enter, espacio y eliminar
                    //es como una especie de pass, como el que se usa en el bucle while
                } else if(ke.getKeyCode() == KeyEvent.VK_SPACE && ke.getKeyCode() == KeyEvent.VK_ENTER && ke.getKeyCode() == KeyEvent.VK_BACK_SPACE){
                    ke.consume();
                    //Quiza hay otra manera de verificar para las minusculas, pero es lo mismo que en uppercase, no tengo que explicar mucho
                } else if(Character.isLowerCase(caracter)){
                    JOptionPane.showMessageDialog(null, "El campo solo deja ingresar letras mayusculas");
                    //Verifico si la entrada es vacia, en caso de que lo sea devuelve la tabla con todos los datos
                } else if(entradas_formulario.getTextFieldConsultar_datos().getText().isEmpty()){
                    tablaConsultaVehiculo.setModel(controladorVehiculo.consultarVehiculos());
                    //Por ultimo en caso tal de que la tabla no tenga registros de la entrada de datos, se mostrara que tal dato no existe
                } else if(tablaConsultaVehiculo.getRowCount() == 0){
                    JOptionPane.showMessageDialog(null, "El registro que trata de buscar no se encuentra en el tabla Vehiculo.");
                }
            }

            @Override
            public void keyTyped(KeyEvent ke) {//solo es relleno lo genera el netbeans                
            }
        });
    }
    public JInternalFrame getConsultarVehiculo() {
        return consultarVehiculo;
    }
}
