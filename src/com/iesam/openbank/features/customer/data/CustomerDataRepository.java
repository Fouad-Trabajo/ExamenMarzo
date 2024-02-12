package com.iesam.openbank.features.customer.data;

import com.iesam.openbank.features.customer.domain.Customer;
import com.iesam.openbank.features.customer.domain.CustomerRepository;

public class CustomerDataRepository implements CustomerRepository {

    private static CustomerDataRepository instance =null; //Instancia de patrón SingleTon

    //Método del patrón SingleTon
    public static CustomerDataRepository newInstance(){
        if (instance==null){
            instance= new CustomerDataRepository();
        }
        return instance;
    }

    //Crear un repositorio para guardar el cliente
    CustomerDataRepository repo= new CustomerDataRepository();

    @Override //GetCustomerUseCase
    public Customer obtainCustomer(String costumerDni) {
        Customer Customer = null;
        return Customer;
    }

    @Override   //SaveCustomerUseCase
    public void saveCustomer(Customer customer) {
            repo.saveCustomer(customer);
    }
}
