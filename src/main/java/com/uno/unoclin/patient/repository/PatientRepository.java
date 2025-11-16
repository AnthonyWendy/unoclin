package com.uno.unoclin.patient.repository;



import com.uno.unoclin.entity.repository.EntityRepository;
import com.uno.unoclin.patient.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends EntityRepository<Patient> {

    @Query("SELECT p FROM Patient p WHERE p.name = :value")
    Patient search(@Param("value") String value);

}

