package com.example.technicaltest.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import com.example.technicaltest.models.EmployeeModel;
import java.util.List;

@Data
@Entity
@Table(name = "company")
public class CompanyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private String name;

    private String address;
}