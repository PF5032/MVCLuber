package model;

public class VehiculoModel {
    private String vehPlaca;
    private String vehMarca;
    private String vehModelo;
    private int vehAnio;
    private int vehCapacidad;
    private String vehColor;
    private int vehKilometros;
    
    public VehiculoModel(String vehPlaca, String vehMarca, String vehModelo, int vehAnio, int vehCapacidad, String vehColor, int vehKilometros){
        this.vehPlaca = vehPlaca;
        this.vehMarca = vehMarca;
        this.vehModelo = vehModelo;
        this.vehAnio = vehAnio;
        this.vehCapacidad = vehCapacidad;
        this.vehColor = vehColor;
        this.vehKilometros = vehKilometros;
    }
    
    public int getVehKilometros() {
        return vehKilometros;
    }

    public void setVehKilometros(int vehKilometros) {
        this.vehKilometros = vehKilometros;
    }

    public String getVehPlaca() {
        return vehPlaca;
    }

    public void setVehPlaca(String vehPlaca) {
        this.vehPlaca = vehPlaca;
    }

    public String getVehMarca() {
        return vehMarca;
    }

    public void setVehMarca(String vehMarca) {
        this.vehMarca = vehMarca;
    }

    public String getVehModelo() {
        return vehModelo;
    }

    public void setVehModelo(String vehModelo) {
        this.vehModelo = vehModelo;
    }

    public int getVehAnio() {
        return vehAnio;
    }

    public void setVehAnio(int vehAnio) {
        this.vehAnio = vehAnio;
    }

    public int getVehCapacidad() {
        return vehCapacidad;
    }

    public void setVehCapacidad(int vehCapacidad) {
        this.vehCapacidad = vehCapacidad;
    }

    public String getVehColor() {
        return vehColor;
    }

    public void setVehColor(String vehColor) {
        this.vehColor = vehColor;
    }
    
}
