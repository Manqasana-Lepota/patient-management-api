package com.manqasana.patientmanagementapi.service;

import com.manqasana.patientmanagementapi.Dto.PatientDto;
import com.manqasana.patientmanagementapi.entity.Patient;

import java.util.List;

public interface PatientService {

    PatientDto createPatient(PatientDto patientDto);

    PatientDto getPatientById(Long id);

    List<PatientDto> getAllPatients();
}
