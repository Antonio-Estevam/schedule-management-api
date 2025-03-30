package com.example.schedule_management.repositorys;

import com.example.schedule_management.models.ProfessionalModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionalRepository extends JpaRepository<ProfessionalModel, Long> {
}