package com.example.test;

import com.example.repository.CustomerRepository;
import com.example.repository.CustomerRepositoryImpl;
import com.example.service.CustomerService;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create the repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService service = new CustomerService(repository);

        // Use the service to find a customer
        String customer = service.getCustomerById("1");
        System.out.println("Customer with ID 1: " + customer);

        customer = service.getCustomerById("2");
        System.out.println("Customer with ID 2: " + customer);

        customer = service.getCustomerById("3");
        System.out.println("Customer with ID 3: " + customer);  // This should return null
    }
}
