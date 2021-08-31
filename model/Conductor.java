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
public class Conductor {
    private int usuCedula;
    private String vehPlaca;

    public Conductor(int usuCedula, String vehPlaca) {
        this.usuCedula = usuCedula;
        this.vehPlaca = vehPlaca;
    }

    public String getVehPlaca() {
        return vehPlaca;
    }

    public void setVehPlaca(String vehPlaca) {
        this.vehPlaca = vehPlaca;
    }

    public int getUsuCedula() {
        return usuCedula;
    }

    public void setUsuCedula(int usuCedula) {
        this.usuCedula = usuCedula;
    }
}
