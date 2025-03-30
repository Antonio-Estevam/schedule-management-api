package com.example.schedule_management.controllers;

import com.example.schedule_management.models.ProfessionalModel;
import com.example.schedule_management.services.ProfessionalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professionals")

public class ProfessionalController {
    private final ProfessionalService pofessionalService;

    public ProfessionalController(ProfessionalService pofessionalService) {
        this.pofessionalService = pofessionalService;
    }

    @GetMapping
    public List<ProfessionalModel> getAllCustomers() {
        return pofessionalService.getAllProfessionals();
    }

    @PostMapping
    public ProfessionalModel createCustomer(@RequestBody ProfessionalModel professionalModel) {
        return pofessionalService.createProfessional(professionalModel);
    }
}
