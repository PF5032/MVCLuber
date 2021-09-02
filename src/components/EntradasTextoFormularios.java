package components;

import javax.swing.JTextField;

//author JP

public class EntradasTextoFormularios extends JTextField{

    JTextField textFieldVehPlaca,textFieldVehMarca,
            textFieldVehModelo, textFieldVehAño,textFieldVehCapacidad,
            textFieldVehColor,textFieldVehKilometros;
    
    //Entradas de texto para usuarios
    JTextField textFieldUsuCedula, textFieldUsuNombres
            , textFieldUsuApellidos, textFieldUsuCorreo;
            
    //Entradas de texto para conductores
    JTextField textFieldUsuCedula_con, textFieldVehPlaca_con;
    
    //Entradas de texto para viajes
    JTextField viaId, usuCedula_usuario, conCedula_con, viaFecha;
    
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

    public JTextField getTextFieldUsuCedula() {
        return textFieldUsuCedula;
    }

    public void setTextFieldUsuCedula(JTextField textFieldUsuCedula) {
        this.textFieldUsuCedula = textFieldUsuCedula;
    }

    public JTextField getTextFieldUsuNombres() {
        return textFieldUsuNombres;
    }

    public void setTextFieldUsuNombres(JTextField textFieldUsuNombres) {
        this.textFieldUsuNombres = textFieldUsuNombres;
    }

    public JTextField getTextFieldUsuApellidos() {
        return textFieldUsuApellidos;
    }

    public void setTextFieldUsuApellidos(JTextField textFieldUsuApellidos) {
        this.textFieldUsuApellidos = textFieldUsuApellidos;
    }

    public JTextField getTextFieldUsuCorreo() {
        return textFieldUsuCorreo;
    }

    public void setTextFieldUsuCorreo(JTextField textFieldUsuCorreo) {
        this.textFieldUsuCorreo = textFieldUsuCorreo;
    }

    public JTextField getTextFieldUsuCedula_con() {
        return textFieldUsuCedula_con;
    }

    public void setTextFieldUsuCedula_con(JTextField textFieldUsuCedula_con) {
        this.textFieldUsuCedula_con = textFieldUsuCedula_con;
    }

    public JTextField getTextFieldVehPlaca_con() {
        return textFieldVehPlaca_con;
    }

    public void setTextFieldVehPlaca_con(JTextField textFieldVehPlaca_con) {
        this.textFieldVehPlaca_con = textFieldVehPlaca_con;
    }

    public JTextField getViaId() {
        return viaId;
    }

    public void setViaId(JTextField viaId) {
        this.viaId = viaId;
    }

    public JTextField getUsuCedula_usuario() {
        return usuCedula_usuario;
    }

    public void setUsuCedula_usuario(JTextField usuCedula_usuario) {
        this.usuCedula_usuario = usuCedula_usuario;
    }

    public JTextField getConCedula_con() {
        return conCedula_con;
    }

    public void setConCedula_con(JTextField conCedula_con) {
        this.conCedula_con = conCedula_con;
    }

    public JTextField getViaFecha() {
        return viaFecha;
    }

    public void setViaFecha(JTextField viaFecha) {
        this.viaFecha = viaFecha;
    }

    public JTextField getTextFieldConsultar_datos() {
        return textFieldConsultar_datos;
    }

    public void setTextFieldConsultar_datos(JTextField textFieldConsultar_datos) {
        this.textFieldConsultar_datos = textFieldConsultar_datos;
    }
}
