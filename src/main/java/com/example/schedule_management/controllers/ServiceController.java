package com.example.schedule_management.controllers;

import com.example.schedule_management.models.CustomerModel;
import com.example.schedule_management.models.ServicesModel;
import com.example.schedule_management.services.ServiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceController {
    private final ServiceService serviceService;

    public ServiceController(ServiceService serviceService){
        this.serviceService = serviceService;
    }

    @GetMapping
    public List<ServicesModel> getAllServices(){
        return serviceService.getAllServices();
    }

    @PostMapping
    public ServicesModel createService(@RequestBody ServicesModel servicesModel){
        return serviceService.createService(servicesModel);
    }

}
