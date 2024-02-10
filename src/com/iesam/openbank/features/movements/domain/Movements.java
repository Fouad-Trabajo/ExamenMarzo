package com.iesam.openbank.features.movements.domain;

public class Movements {
    private String codigoTransaccion;
    private String descripcion;
    private String importe;

    public Movements(String codigoTransaccion, String descripcion, String importe) {
        this.codigoTransaccion = codigoTransaccion;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public void setCodigoTransaccion(String codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Movements{" +
                "codigoTransaccion='" + codigoTransaccion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", importe='" + importe + '\'' +
                '}';
    }
}
