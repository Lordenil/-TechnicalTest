package com.example.technicaltest.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.technicaltest.models.EmployeeModel;
import com.example.technicaltest.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public ArrayList<EmployeeModel> findEmployees() {
        return (ArrayList<EmployeeModel>) employeeRepository.findAll();
    }

    public EmployeeModel saveEmployee(EmployeeModel employee) {
        return employeeRepository.save(employee);
    }

    public Optional<EmployeeModel> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public ArrayList<EmployeeModel> findByName(String name) {
        return employeeRepository.findByName(name);
    }

    public boolean deleteEmployee(Long id) {
        try {
            employeeRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}