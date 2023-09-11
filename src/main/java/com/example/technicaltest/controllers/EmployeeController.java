package com.example.technicaltest.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.technicaltest.models.EmployeeModel;
import com.example.technicaltest.services.EmployeeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:5173")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping()
    public ArrayList<EmployeeModel> find(){
        return employeeService.find();
    }

    @PutMapping(path = "/{id}")
    public EmployeeModel update(@RequestBody EmployeeModel employee){
        return this.employeeService.update(employee);
    }

    @PostMapping()
    public EmployeeModel save(@RequestBody EmployeeModel employee){
        return this.employeeService.save(employee);
    }

    @GetMapping( path = "/{id}")
    public Optional<EmployeeModel> findById(@PathVariable("id") Long id) {
        return this.employeeService.findById(id);
    }

    @GetMapping("/query")
    public ArrayList<EmployeeModel> findByName(@RequestParam("name") String name){
        return this.employeeService.findByName(name);
    }

    @DeleteMapping( path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.employeeService.delete(id);
        
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }

}