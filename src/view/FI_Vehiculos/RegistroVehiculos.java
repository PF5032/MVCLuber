package view.FI_Vehiculos;
import javax.swing.JInternalFrame;
import components.EntradasTextoFormularios;
import components.EtiquetasFormularios;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import util.SpringUtilities;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

//importo al modelo de vehiculos para hacer la respectiva insercion de datos
import model.VehiculoModel;

//importo al controlador de vehiculo
import controller.VehiculoController;

/**
 *
 * @author Lau
 */

public class RegistroVehiculos extends JInternalFrame{
    
    //formulario principal
    JInternalFrame vehiculoForm;
    
    //panel principal
    JPanel panel;
    
    //botones
    JButton RegistrarVeh;
    
    //etiquetas
    EtiquetasFormularios etiquetas, estado;
    
    //entradas de texto
    EntradasTextoFormularios entradas;
    
    //Creo una instancia para el controlador de vehiculos
    VehiculoController vehiculoControlador;
    
    //Creo la variable para manejar los eventos de esta clase
    RegistroVehiculos registroVehiculos;
    
    public RegistroVehiculos(){
        //configuracion de la ventana
        vehiculoForm = new JInternalFrame();
        vehiculoForm.setTitle("Registro vehiculos");
        vehiculoForm.setSize(760, 520);
        vehiculoForm.setClosable(true);
        
        //creo el panel principal
        panel = new JPanel(new SpringLayout()); //new SpringLayout() 
        
        //etiquetas
        etiquetas = new EtiquetasFormularios();
        //placa, marca, modelo, año, capacidad, color, kilometros
        //entradas de texto
        entradas = new EntradasTextoFormularios();
        //llamo los activadores
        estado = new EtiquetasFormularios();
        
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
        /*
        *   Metodo para hacer el respectivo registro de los datos nuevo
        *   @return El mensaje de que lo ingresado en la caja de texto concuerda
        */
        RegistrarVeh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String placa = entradas.getTextFieldVehPlaca().getText();
                String marca = entradas.getTextFieldVehMarca().getText();
                String modelo = entradas.getTextFieldVehModelo().getText();
                String año = entradas.getTextFieldVehAño().getText();
                String capacidad = entradas.getTextFieldVehCapacidad().getText();
                String color = entradas.getTextFieldVehColor().getText();
                String kilometraje = entradas.getTextFieldVehKilometros().getText();
                
                //Validacion para la placa
                //si tiene una minuscula el texto del campo lo borrara, esto pasando con todos los campos
                if (!placa.matches("[A-Z].*") && !placa.matches("[0-9]")) {
                    entradas.getTextFieldVehPlaca().setText(null);
                } else {
                    estado.setFlag_placa(true);
                }
                //La marca, si es vacia o menor a 3 caracteres el campo lo borra
                if(marca.isEmpty() || marca.length() < 3){
                    entradas.getTextFieldVehMarca().setText(null);
                }else{estado.setFlag_marca(true);}
                
                //Validacion para modelo, lo mismo que el anterior
                if (modelo.isEmpty() || modelo.length() < 3) {
                    entradas.getTextFieldVehModelo().setText(null);
                } else {
                    estado.setFlag_modelo(true);
                }
                //validacion para año, si el año es diferente de un numero y menor a 4 o mayor a 4 digitos
                if (!año.matches("[0-9]") && año.length() < 4 || año.length() > 4 || año.isEmpty() || Integer.parseInt(año) == 0) {
                    entradas.getTextFieldVehAño().setText(null);
                } else {
                    estado.setFlag_año(true);
                }
                //validacion para capacidad, si la capacidad tiene letras y es mayor a 3 digitos
                if (!capacidad.matches("[0-9]") || capacidad.length() > 3 || capacidad.isEmpty()) {
                    entradas.getTextFieldVehCapacidad().setText(null);
                } else {
                    estado.setFlag_capacidad(true);
                }
                //Validacion para color, si el color tiene numeros tambien borra el contenido de la caja
                if(color.matches("[0-9].*")) {
                    entradas.getTextFieldVehColor().setText(null);
                } else {
                    estado.setFlag_color(true);
                }
                
                //Validacion para kilometraje, si el kilometraje es mayor a 150000 lo borra
                if (!kilometraje.matches("[0-9]") && Integer.parseInt(kilometraje) > 150000) {
                    entradas.getTextFieldVehKilometros().setText(null);
                } else {
                    estado.setFlag_kilometraje(true);
                }
                //si todas los activadores estan en verdadero hara el registro de los campos en la base de datos
                if (estado.isFlag_placa() && estado.isFlag_marca()&& estado.isFlag_modelo()&& estado.isFlag_año()&& estado.isFlag_capacidad()&& estado.isFlag_color()&& estado.isFlag_kilometraje()== true) {
                    VehiculoModel vehiculo = new VehiculoModel(placa, marca, modelo, Integer.parseInt(año), Integer.parseInt(capacidad), color, Integer.parseInt(kilometraje));
                    vehiculoControlador.agregarVehiculo(vehiculo);
                    entradas.getTextFieldVehPlaca().setText(null); //uso null para borrar el contenido despues de ingresar la informacion
                    entradas.getTextFieldVehMarca().setText(null);
                    entradas.getTextFieldVehModelo().setText(null);
                    entradas.getTextFieldVehAño().setText(null);
                    entradas.getTextFieldVehCapacidad().setText(null);
                    entradas.getTextFieldVehColor().setText(null);
                    entradas.getTextFieldVehKilometros().setText(null);
                }
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
        panel_principal.add(panel, BorderLayout.CENTER);
        //creo un panel nuevo para los botones
        JPanel panel_botones = new JPanel(new BorderLayout());
        
        panel_botones.add(RegistrarVeh, BorderLayout.SOUTH);
        
        panel_principal.add(panel_botones);
    }

    public JInternalFrame getVehiculoForm() {
        return vehiculoForm;
    }

    public RegistroVehiculos getRegistroVehiculos() {
        return registroVehiculos;
    }

    public EntradasTextoFormularios getEntradas() {
        return entradas;
    }
}