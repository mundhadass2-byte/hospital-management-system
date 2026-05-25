package com.example.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.hospitalmanagement.entity.Patient;
import com.example.hospitalmanagement.repository.PatientRepository;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository repo;

    // SAVE PATIENT
    @PostMapping
    public Patient savePatient(
            @RequestBody Patient patient) {

        return repo.save(patient);
    }

    // GET ALL PATIENTS
    @GetMapping
    public List<Patient> getAllPatients() {
        return repo.findAll();
    }
}