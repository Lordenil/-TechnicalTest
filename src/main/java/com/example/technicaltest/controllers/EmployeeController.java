package com.example.technicaltest.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.technicaltest.models.EmployeeModel;
import com.example.technicaltest.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping()
    public ArrayList<EmployeeModel> findEmployee(){
        return employeeService.findEmployees();
    }

    @PostMapping()
    public EmployeeModel saveEmployee(@RequestBody EmployeeModel employee){
        return this.employeeService.saveEmployee(employee);
    }

    @GetMapping( path = "/{id}")
    public Optional<EmployeeModel> findEmployeeById(@PathVariable("id") Long id) {
        return this.employeeService.findById(id);
    }

    @GetMapping("/query")
    public ArrayList<EmployeeModel> findEmployeeByName(@RequestParam("name") String name){
        return this.employeeService.findByName(name);
    }

    @DeleteMapping( path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.employeeService.deleteEmployee(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }

}