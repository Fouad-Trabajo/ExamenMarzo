package com.iesam.openbank.features.banckProduct.domain;

public class Hipoteca extends BanckProduct{
    private String fechaInicio;
    private String interes;
    private String fechaFin;
    private String importe;

    public Hipoteca(String codigoProducto, String nombre, String descripcion, String fechaInicio, String interes, String fechaFin, String importe) {
        super(codigoProducto, nombre, descripcion);
        this.fechaInicio = fechaInicio;
        this.interes = interes;
        this.fechaFin = fechaFin;
        this.importe = importe;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Hipoteca{" +
                "fechaInicio='" + fechaInicio + '\'' +
                ", interes='" + interes + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", importe='" + importe + '\'' +
                '}';
    }
}
