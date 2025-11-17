package com.uno.unoclin.medicalrecord.service;

import com.uno.unoclin.entity.repository.EntityRepository;
import com.uno.unoclin.entity.service.EntityBaseService;
import com.uno.unoclin.medicalrecord.domain.MedicalRecord;
import com.uno.unoclin.schedule.domain.Schedule;
import org.springframework.stereotype.Service;

@Service
public class MedicalRegisterService extends EntityBaseService<MedicalRecord> {

    public MedicalRegisterService(EntityRepository<MedicalRecord> repository) {
        super(repository);
    }
}
