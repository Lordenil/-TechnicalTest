package com.example.technicaltest.repositories;

import java.util.ArrayList;
import com.example.technicaltest.models.EmployeeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeModel, Long> {
    public abstract ArrayList<EmployeeModel> findByName(String name);
}