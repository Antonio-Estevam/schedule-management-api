package com.example.schedule_management.services;

import com.example.schedule_management.models.ServicesModel;
import com.example.schedule_management.repositorys.ServicesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {

    private final ServicesRepository repository;

    public ServiceService(ServicesRepository repository) {
        this.repository = repository;
    }

    public List<ServicesModel> getAllServices() {

        return repository.findAll();
    }

    public ServicesModel createService(ServicesModel servicesModel) {
        return repository.save(servicesModel);
    }
}
