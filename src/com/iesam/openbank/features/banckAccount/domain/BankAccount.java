package com.iesam.openbank.features.banckAccount.domain;

import com.iesam.openbank.features.banckProduct.domain.BanckProduct;
import com.iesam.openbank.features.customer.domain.Customer;
import com.iesam.openbank.features.movements.domain.Movements;

import java.util.List;

public class BankAccount {
    private String nombreCuenta;
    private String saldo;
    private Customer titularCuenta;
    private List<Movements> transacciones;
    private List<BanckProduct> productosBancarios;

    public BankAccount(String nombreCuenta, String saldo, Customer titularCuenta, List<Movements> transacciones, List<BanckProduct> productosBancarios) {
        this.nombreCuenta = nombreCuenta;
        this.saldo = saldo;
        this.titularCuenta = titularCuenta;
        this.transacciones = transacciones;
        this.productosBancarios = productosBancarios;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public Customer getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(Customer titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public List<Movements> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Movements> transacciones) {
        this.transacciones = transacciones;
    }

    public List<BanckProduct> getProductosBancarios() {
        return productosBancarios;
    }

    public void setProductosBancarios(List<BanckProduct> productosBancarios) {
        this.productosBancarios = productosBancarios;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "nombreCuenta='" + nombreCuenta + '\'' +
                ", saldo='" + saldo + '\'' +
                ", titularCuenta=" + titularCuenta +
                ", transacciones=" + transacciones +
                ", productosBancarios=" + productosBancarios +
                '}';
    }
}
