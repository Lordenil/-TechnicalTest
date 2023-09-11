package com.example.technicaltest.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.technicaltest.models.CompanyModel;
import com.example.technicaltest.services.CompanyService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:5173")
@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @GetMapping()
    public ArrayList<CompanyModel> find(){
        return companyService.find();
    }

    @PostMapping()
    public CompanyModel save(@RequestBody CompanyModel company){
        return this.companyService.save(company);
    }

    @PutMapping(path = "/{id}")
    public CompanyModel update(@RequestBody CompanyModel company){
        return this.companyService.update(company);
    }

    @GetMapping( path = "/{id}")
    public Optional<CompanyModel> findById(@PathVariable("id") Long id) {
        return this.companyService.findById(id);
    }

    @GetMapping("/query")
    public ArrayList<CompanyModel> findByName(@RequestParam("name") String name){
        return this.companyService.findByName(name);
    }

    @DeleteMapping( path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.companyService.delete(id);

        return ok
                 ? "Se eliminó la empresa con id " + id
                 :  "No pudo eliminar la empresa con id" + id;
    }
}