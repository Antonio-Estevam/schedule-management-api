package com.example.schedule_management.Controller;

import com.example.schedule_management.models.CustomersModel;
import com.example.schedule_management.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping
    public List<CustomersModel> getAllCustomersModel() {
        return service.getAllCustomers();
    }

    @PostMapping
    public CustomersModel createCustomer(@RequestBody CustomersModel customersModel) {
        return service.createCustomer(customersModel);
    }
}
