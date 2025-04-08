package com.example.schedule_management.controllers;

import com.example.schedule_management.models.CustomerModel;
import com.example.schedule_management.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {

        this.customerService = customerService;
    }

   @GetMapping
    public List<CustomerModel> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public CustomerModel createCustomer(@RequestBody CustomerModel customersModel) {
        return customerService.createCustomer(customersModel);
    }
}
