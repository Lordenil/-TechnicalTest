package com.example.technicaltest.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.technicaltest.models.CompanyModel;
import com.example.technicaltest.repositories.CompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    public ArrayList<CompanyModel> find() {
        return (ArrayList<CompanyModel>) companyRepository.findAll();
    }

    public CompanyModel save(CompanyModel company) {
            return companyRepository.save(company);
    }

    public CompanyModel update(CompanyModel company) {
        return companyRepository.save(company);
    }

    public Optional<CompanyModel> findById(Long id) {
        return companyRepository.findById(id);
    }

    public ArrayList<CompanyModel> findByName(String name) {
        return companyRepository.findByName(name);
    }

    public boolean delete(Long id) {
        try {
            companyRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}