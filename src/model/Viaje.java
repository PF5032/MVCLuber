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
public class Viaje {
    private int viaId;
    private int usuCedula;
    private int conCedula;
    private String viaFecha;

    public Viaje(int viaId, int usuCedula, int conCedula, String viaFecha) {
        this.viaId = viaId;
        this.usuCedula = usuCedula;
        this.conCedula = conCedula;
        this.viaFecha = viaFecha;
    }

    public String getViaFecha() {
        return viaFecha;
    }

    public void setViaFecha(String viaFecha) {
        this.viaFecha = viaFecha;
    }

    public int getViaId() {
        return viaId;
    }

    public void setViaId(int viaId) {
        this.viaId = viaId;
    }

    public int getUsuCedula() {
        return usuCedula;
    }

    public void setUsuCedula(int usuCedula) {
        this.usuCedula = usuCedula;
    }

    public int getConCedula() {
        return conCedula;
    }

    public void setConCedula(int conCedula) {
        this.conCedula = conCedula;
    }
}
