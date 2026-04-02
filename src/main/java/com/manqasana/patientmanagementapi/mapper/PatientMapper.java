package com.manqasana.patientmanagementapi.mapper;

import com.manqasana.patientmanagementapi.Dto.PatientDto;
import com.manqasana.patientmanagementapi.entity.Patient;

public class PatientMapper {

    public static Patient mapToPatient(PatientDto patientDto) {
        Patient patient = new Patient(
        patientDto.getId(),
        patientDto.getFirstName(),
        patientDto.getLastName(),
        patientDto.getDateOfBirth(),
        patientDto.getGender(),
        patientDto.getPhoneNumber(),
        patientDto.getEmail(),
        patientDto.getAddress(),
        patientDto.getMedicalHistory(),
        patientDto.getAllergies(),
        patientDto.getBloodGroup(),
        patientDto.getCreatedAt(),
        patientDto.getUpdatedAt(),
        patientDto.isActive());
        return patient;
    }

    public static PatientDto mapToPatientDto(Patient patient) {
        PatientDto patientDto = new PatientDto(
                patient.getId(),
                patient.getFirstName(),
                patient.getLastName(),
                patient.getDateOfBirth(),
                patient.getGender(),
                patient.getPhoneNumber(),
                patient.getEmail(),
                patient.getAddress(),
                patient.getMedicalHistory(),
                patient.getAllergies(),
                patient.getBloodGroup(),
                patient.getCreatedAt(),
                patient.getUpdatedAt(),
                patient.isActive());
        return patientDto;
    }
}

