package com.example.technicaltest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "company")
public class CompanyModel {

    @Id
    @Column(unique = true, nullable = false)
    private int id;

    private String name;
    private String address;
}