package com.manqasana.patientmanagementapi.controller;

import com.manqasana.patientmanagementapi.Dto.PatientDto;
import com.manqasana.patientmanagementapi.entity.Patient;
import com.manqasana.patientmanagementapi.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    // CREATE PATIENT REST API
    @PostMapping
    public ResponseEntity<PatientDto> createPatient(@RequestBody PatientDto patientDto) {
        return new ResponseEntity<>(patientService.createPatient(patientDto), HttpStatus.CREATED);
    }

    // GET PATIENT BY ID REST API
    @GetMapping("/{id}")
    public ResponseEntity<PatientDto> getPatientById(@PathVariable Long id) {
        PatientDto patientDto = patientService.getPatientById(id);
        return ResponseEntity.ok(patientDto);
    }

    // GET ALL PATIENTS REST API
    @GetMapping
    public ResponseEntity<List<PatientDto>> getAllPatients() {
        List<PatientDto> patientDtos = patientService.getAllPatients();
        return ResponseEntity.ok(patientDtos);
    }
}
