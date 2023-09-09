package com.example.technicaltest.models;

import jakarta.persistence.*;
import com.example.technicaltest.models.EmployeeModel;
import java.util.List;

@Entity
@Table(name = "company")
public class CompanyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private String name;
    private String address;

    @OneToMany(mappedBy="company")
    private List<EmployeeModel> employees;
}