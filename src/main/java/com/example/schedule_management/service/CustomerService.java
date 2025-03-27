package com.example.schedule_management.service;

import org.springframework.stereotype.Service;
import com.example.schedule_management.models.CustomersModel;
import com.example.schedule_management.repository.CustomerRepository;
import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<CustomersModel> getAllCustomers() {
        return repository.findAll();
    }

    public CustomersModel createCustomer(CustomersModel customer) {
        return repository.save(customer);
    }
}
