package com.example.schedule_management.services;

import com.example.schedule_management.models.CustomerModel;
import com.example.schedule_management.repositorys.CustomerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<CustomerModel> getAllCustomers() {
        return repository.findAll();
    }

    public CustomerModel createCustomer(CustomerModel customersModel) {
        return repository.save(customersModel);
    }
}
