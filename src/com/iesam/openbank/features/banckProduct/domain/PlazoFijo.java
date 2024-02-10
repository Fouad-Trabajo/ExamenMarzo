package com.iesam.openbank.features.banckProduct.domain;

public class PlazoFijo extends BanckProduct{
    private String duracionMeses;
    private String interes;

    public PlazoFijo(String codigoProducto, String nombre, String descripcion, String duracionMeses, String interes) {
        super(codigoProducto, nombre, descripcion);
        this.duracionMeses = duracionMeses;
        this.interes = interes;
    }

    public String getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(String duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    public String getInteres() {
        return interes;
    }

    public void setInteres(String interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "PlazoFijo{" +
                "duracionMeses='" + duracionMeses + '\'' +
                ", interes='" + interes + '\'' +
                '}';
    }
}
