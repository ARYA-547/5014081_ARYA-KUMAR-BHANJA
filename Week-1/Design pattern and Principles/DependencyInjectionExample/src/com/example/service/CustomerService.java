package com.example.service;

import com.example.repository.CustomerRepository;

public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomerById(String id) {
        return customerRepository.findCustomerById(id);
    }
}
