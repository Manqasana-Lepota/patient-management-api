package com.manqasana.patientmanagementapi.service.Impl;

import com.manqasana.patientmanagementapi.Dto.PatientDto;
import com.manqasana.patientmanagementapi.entity.Patient;
import com.manqasana.patientmanagementapi.mapper.PatientMapper;
import com.manqasana.patientmanagementapi.repository.PatientRepository;
import com.manqasana.patientmanagementapi.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public PatientDto createPatient(PatientDto patientDto) {
        Patient patient = PatientMapper.mapToPatient(patientDto);
        Patient savedPatient = patientRepository.save(patient);
        return PatientMapper.mapToPatientDto(savedPatient);
    }

    @Override
    public PatientDto getPatientById(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient with this Id does not exit"));
        return PatientMapper.mapToPatientDto(patient);
    }

    @Override
    public List<PatientDto> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();
        return patients.stream().map(PatientMapper::mapToPatientDto).collect(Collectors.toList());
    }
}
