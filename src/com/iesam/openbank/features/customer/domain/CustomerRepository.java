package com.iesam.openbank.features.customer.domain;

public interface CustomerRepository {

    //GetCustomerUseCase
    public Customer obtainCustomer(String customerDni);
}
