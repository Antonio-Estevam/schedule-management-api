package com.example.schedule_management.repositorys;

import com.example.schedule_management.models.ServicesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicesRepository extends JpaRepository<ServicesModel, Long> {
}