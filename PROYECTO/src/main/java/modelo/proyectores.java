package modelo;

public class proyectores {
   private String modelo;
   private double resolucion;
   private int brillo;
   private double pdolar;
   private double psol;

    public proyectores(String modelo, double resolucion, int brillo, double pdolar, double psol) {
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.brillo = brillo;
        this.pdolar = pdolar;
        this.psol = psol;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public int getBrillo() {
        return brillo;
    }

    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }

    public double getPdolar() {
        return pdolar;
    }

    public void setPdolar(double pdolar) {
        this.pdolar = pdolar;
    }

    public double getPsol() {
        return psol;
    }

    public void setPsol(double psol) {
        this.psol = psol;
    }
   

}