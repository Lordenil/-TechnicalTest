package com.example.technicaltest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private String name;
    private String mail;
    private int phone;
}