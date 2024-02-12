package com.iesam.openbank.features.customer.domain;

public class SaveCustomerUseCase {
    private CustomerRepository customerRepository;

    //Constructor
    public SaveCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //Método ejecutar
    public void execute(Customer customer){
        customerRepository.saveCustomer(customer);
    }
}
