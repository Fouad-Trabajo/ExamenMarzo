package com.iesam.openbank.features.customer.presentation;

import com.iesam.openbank.features.customer.data.CustomerDataRepository;
import com.iesam.openbank.features.customer.domain.Customer;
import com.iesam.openbank.features.customer.domain.CustomerRepository;
import com.iesam.openbank.features.customer.domain.GetCustomerUseCase;
import com.iesam.openbank.features.customer.domain.SaveCustomerUseCase;

public class MainCustomer {

    //Crear Cliente
    public static void createCustomer(Customer customer){
        CustomerDataRepository customerDataRepository= CustomerDataRepository.newInstance();
        SaveCustomerUseCase saveCustomerUseCase= new SaveCustomerUseCase(customerDataRepository);
        saveCustomerUseCase.execute(customer);
    }

    //Obtener Cliente
    public static void printCustomer(String customer){
        GetCustomerUseCase getCustomerUseCase= new GetCustomerUseCase(CustomerDataRepository.newInstance());
        Customer customer1= getCustomerUseCase.execute(customer);
        //Imprimir Cliente
        System.out.println(customer.toString());
    }
}
