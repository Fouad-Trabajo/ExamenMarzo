package com.iesam.openbank.features.customer.domain;

public class GetCustomerUseCase {

    //Atributo
    private CustomerRepository customerRepository;

    //Constructor
    public GetCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //Método ejecutar
    public Customer execute(String customerDni){
        return this.customerRepository.obtainCustomer(customerDni);
    }
}
