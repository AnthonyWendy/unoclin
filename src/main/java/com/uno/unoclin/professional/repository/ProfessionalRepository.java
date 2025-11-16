package com.uno.unoclin.professional.repository;

import com.uno.unoclin.entity.repository.EntityRepository;
import com.uno.unoclin.patient.domain.Patient;
import com.uno.unoclin.professional.domain.Professional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ProfessionalRepository extends EntityRepository<Professional> {

    @Query("SELECT p FROM Professional p WHERE p.name = :value")
    Professional search(@Param("value") String value);
}
