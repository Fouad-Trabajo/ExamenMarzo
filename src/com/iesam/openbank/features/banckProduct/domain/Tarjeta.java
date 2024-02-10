package com.iesam.openbank.features.banckProduct.domain;

public class Tarjeta extends BanckProduct{

    private String fechaCaducidad;
    private String numeroTarjeta;

    public Tarjeta(String codigoProducto, String nombre, String descripcion, String fechaCaducidad, String numeroTarjeta) {
        super(codigoProducto, nombre, descripcion);
        this.fechaCaducidad = fechaCaducidad;
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "fechaCaducidad='" + fechaCaducidad + '\'' +
                ", numeroTarjeta='" + numeroTarjeta + '\'' +
                '}';
    }
}
