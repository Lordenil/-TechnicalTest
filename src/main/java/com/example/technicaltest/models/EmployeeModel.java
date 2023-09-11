package com.example.technicaltest.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import com.example.technicaltest.models.CompanyModel;

@Data
@Entity
@Table(name = "employee")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private String name;

    private String identification;

    private String mail;

    private String phone;

    @ManyToOne
    @PrimaryKeyJoinColumn
    private CompanyModel company;
}