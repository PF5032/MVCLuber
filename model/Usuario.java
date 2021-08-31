/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lau
 */
public class Usuario {
    
    private int usuCedula;
    private String usuNombres;
    private String usuApellidos;
    private String usuCorreo;
    
    public Usuario(int usuCedula, String usuNombre, String usuApellidos, String usuCorreo){
        this.usuCedula = usuCedula;
        this.usuNombres = usuNombre;
        this.usuApellidos = usuApellidos;
        this.usuCorreo = usuCorreo;
    }

    public String getUsuCorreo() {
        return usuCorreo;
    }

    public void setUsuCorreo(String usuCorreo) {
        this.usuCorreo = usuCorreo;
    }

    public int getUsuCedula() {
        return usuCedula;
    }

    public void setUsuCedula(int usuCedula) {
        this.usuCedula = usuCedula;
    }

    public String getUsuNombres() {
        return usuNombres;
    }

    public void setUsuNombres(String usuNombres) {
        this.usuNombres = usuNombres;
    }

    public String getUsuApellidos() {
        return usuApellidos;
    }

    public void setUsuApellidos(String usuApellidos) {
        this.usuApellidos = usuApellidos;
    }
}
