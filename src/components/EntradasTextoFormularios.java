package components;

import javax.swing.JTextField;

//author JP

public class EntradasTextoFormularios extends JTextField{

    JTextField textFieldVehPlaca,textFieldVehMarca,
            textFieldVehModelo, textFieldVehAño,textFieldVehCapacidad,
            textFieldVehColor,textFieldVehKilometros;
    
    //Entrada para busquedas
    JTextField textFieldConsultar_datos;
    
    public EntradasTextoFormularios(){
        textFieldVehPlaca = new JTextField(7);
        textFieldVehMarca = new JTextField(10);
        textFieldVehModelo = new JTextField(10);
        textFieldVehAño = new JTextField(10);
        textFieldVehCapacidad = new JTextField(10);
        textFieldVehColor = new JTextField(10);
        textFieldVehKilometros = new JTextField(10);
        textFieldConsultar_datos = new JTextField(20);
    }

    public JTextField getTextFieldVehPlaca() {
        return textFieldVehPlaca;
    }

    public void setTextFieldVehPlaca(JTextField textFieldVehPlaca) {
        this.textFieldVehPlaca = textFieldVehPlaca;
    }

    public JTextField getTextFieldVehMarca() {
        return textFieldVehMarca;
    }

    public void setTextFieldVehMarca(JTextField textFieldVehMarca) {
        this.textFieldVehMarca = textFieldVehMarca;
    }

    public JTextField getTextFieldVehModelo() {
        return textFieldVehModelo;
    }

    public void setTextFieldVehModelo(JTextField textFieldVehModelo) {
        this.textFieldVehModelo = textFieldVehModelo;
    }

    public JTextField getTextFieldVehAño() {
        return textFieldVehAño;
    }

    public void setTextFieldVehAño(JTextField textFieldVehAño) {
        this.textFieldVehAño = textFieldVehAño;
    }

    public JTextField getTextFieldVehCapacidad() {
        return textFieldVehCapacidad;
    }

    public void setTextFieldVehCapacidad(JTextField textFieldVehCapacidad) {
        this.textFieldVehCapacidad = textFieldVehCapacidad;
    }

    public JTextField getTextFieldVehColor() {
        return textFieldVehColor;
    }

    public void setTextFieldVehColor(JTextField textFieldVehColor) {
        this.textFieldVehColor = textFieldVehColor;
    }

    public JTextField getTextFieldVehKilometros() {
        return textFieldVehKilometros;
    }

    public void setTextFieldVehKilometros(JTextField textFieldVehKilometros) {
        this.textFieldVehKilometros = textFieldVehKilometros;
    }

    public JTextField getTextFieldConsultar_datos() {
        return textFieldConsultar_datos;
    }

    public void setTextFieldConsultar_datos(JTextField textFieldConsultar_datos) {
        this.textFieldConsultar_datos = textFieldConsultar_datos;
    }
}
