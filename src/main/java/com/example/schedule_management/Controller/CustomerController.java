package com.example.schedule_management.Controller;

import com.example.schedule_management.models.CustomersModel;
import com.example.schedule_management.service.CustomerService;
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
    public List<CustomersModel> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public CustomersModel createCustomer(@RequestBody CustomersModel customersModel) {
        return customerService.createCustomer(customersModel);
    }
}
