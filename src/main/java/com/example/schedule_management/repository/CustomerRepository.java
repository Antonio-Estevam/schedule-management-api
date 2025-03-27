package com.example.schedule_management.repository;

import com.example.schedule_management.models.CustomersModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomersModel, Long> {
}
