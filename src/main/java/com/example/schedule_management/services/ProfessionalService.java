package com.example.schedule_management.services;

import com.example.schedule_management.models.ProfessionalModel;
import com.example.schedule_management.repositorys.ProfessionalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalService {

    private final ProfessionalRepository repository;

    public ProfessionalService(ProfessionalRepository repository) {
        this.repository = repository;
    }

    public List<ProfessionalModel> getAllProfessionals() {
        return repository.findAll();
    }

    public ProfessionalModel createProfessional(ProfessionalModel customerModel) {
        return repository.save(customerModel);
    }
}
