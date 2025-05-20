package com.example.schedule_management.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
    @Table(name = "professionals")
public class ProfessionalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String specialty;
    @ManyToMany
    @JoinTable(
            name = "professionals_services",
            joinColumns = @JoinColumn(
                    name = "professionals_id"
            ),inverseJoinColumns = @JoinColumn(name = "services_id")
    )
    private Set<ServicesModel> services;


    public void Customer(Long id, String firstName, String lastName, String email, String specialty) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.specialty = specialty;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }


}
