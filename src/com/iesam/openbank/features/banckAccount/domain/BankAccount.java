package com.iesam.openbank.features.banckAccount.domain;

import com.iesam.openbank.features.customer.domain.Customer;
import com.iesam.openbank.features.movements.domain.Movements;

public class BankAccount {
    private String nombreCuenta;
    private String saldo;
    Customer titularCuenta;
    Movements transacciones;

    public BankAccount(String nombreCuenta, String saldo, Customer titularCuenta, Movements transacciones) {
        this.nombreCuenta = nombreCuenta;
        this.saldo = saldo;
        this.titularCuenta = titularCuenta;
        this.transacciones = transacciones;
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

    public Movements getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Movements transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "nombreCuenta='" + nombreCuenta + '\'' +
                ", saldo='" + saldo + '\'' +
                ", titularCuenta=" + titularCuenta +
                ", transacciones=" + transacciones +
                '}';
    }
}
