package com.iesam.openbank;

import com.iesam.openbank.features.banckAccount.domain.BankAccount;
import com.iesam.openbank.features.banckAccount.presentation.MainBanckAccount;
import com.iesam.openbank.features.banckProduct.domain.BanckProduct;
import com.iesam.openbank.features.banckProduct.presentation.MainBanckProduct;
import com.iesam.openbank.features.customer.data.CustomerDataRepository;
import com.iesam.openbank.features.customer.domain.Customer;
import com.iesam.openbank.features.customer.presentation.MainCustomer;
import com.iesam.openbank.features.movements.domain.Movements;
import com.iesam.openbank.features.movements.presentation.MainMovements;


public class Main {


    public static void main(String[] args) {
        Customer customer = new Customer("12052629D","Federico",
                "Hernandez","C/ Los Plátanos", "Ávila",
                "0500");

        MainCustomer.createCustomer(customer);

        MainCustomer.printCustomer(customer.toString());


        BanckProduct hipoteca = new BanckProduct("0050",
                "Hipoteca al L/P","Ninguna");
        MainBanckProduct.createHipoteca(hipoteca);

        BankAccount bankAccount = new BankAccount("Federico 004","500","Federico"
                "hipoteca");
        MainBanckAccount.createBanckAccount(bankAccount);

        Movements pago = Movements("");
        MainMovements.createMovements(pago);

    }
}