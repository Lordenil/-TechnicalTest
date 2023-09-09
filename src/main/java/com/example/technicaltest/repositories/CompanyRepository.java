package com.example.technicaltest.repositories;

import java.util.ArrayList;
import com.example.technicaltest.models.CompanyModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<CompanyModel, Long> {
    public abstract ArrayList<CompanyModel> findByName(String name);
}