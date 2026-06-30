package com.hospital.hospitalmanagement.service;

import com.hospital.hospitalmanagement.entity.Patient;
import com.hospital.hospitalmanagement.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientUpdateService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient update(Long id, Patient patientDetails) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));
        patient.setPatientName(patientDetails.getPatientName());
        patient.setBirthDate(patientDetails.getBirthDate());
        patient.setAge(patientDetails.getAge());
        patient.setGender(patientDetails.getGender());
        patient.setBloodGroup(patientDetails.getBloodGroup());
        patient.setContact(patientDetails.getContact());
        patient.setEmail(patientDetails.getEmail());
        return patientRepository.save(patient);
    }
}
