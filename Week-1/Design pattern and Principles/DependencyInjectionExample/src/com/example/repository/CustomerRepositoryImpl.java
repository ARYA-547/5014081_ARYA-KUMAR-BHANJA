package com.example.repository;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, String> customerData;

    public CustomerRepositoryImpl() {
        customerData = new HashMap<>();
        customerData.put("1", "ARYA KUMAR BHANJA");
        customerData.put("2", "SOFTWARE DEVELOPER");
    }

    @Override
    public String findCustomerById(String id) {
        return customerData.get(id);
    }
}
