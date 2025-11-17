package com.uno.unoclin.medicalrecord.repository;

import com.uno.unoclin.entity.repository.EntityRepository;
import com.uno.unoclin.medicalrecord.domain.MedicalRecord;
import com.uno.unoclin.schedule.domain.Schedule;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalRegisterRepository extends EntityRepository<MedicalRecord> {
}
