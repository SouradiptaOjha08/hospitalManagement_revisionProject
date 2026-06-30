package com.hospital.hospitalmanagement.service;

import com.hospital.hospitalmanagement.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientDeleteService {

    @Autowired
    private PatientRepository patientRepository;

    public void deleteById(Long id) {
        patientRepository.deleteById(id);
    }
}
