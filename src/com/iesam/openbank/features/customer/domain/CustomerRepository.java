package com.iesam.openbank.features.customer.domain;

public interface CustomerRepository {


    Customer obtainCustomer(String customerDni); //GetCustomerUseCase

    void saveCustomer(Customer customer); //SaveUseCase
}


