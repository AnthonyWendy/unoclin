package com.uno.unoclin.patient.service;


import com.uno.unoclin.entity.repository.EntityRepository;
import com.uno.unoclin.entity.service.EntityBaseService;
import com.uno.unoclin.patient.domain.Patient;
import org.springframework.stereotype.Service;

@Service
public class PatientService extends EntityBaseService<Patient> {

    public PatientService(EntityRepository<Patient> repository) {
        super(repository);
    }
}
