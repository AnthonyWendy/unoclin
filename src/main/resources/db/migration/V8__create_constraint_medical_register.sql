ALTER TABLE medical_record
    ADD CONSTRAINT fk_medical_record_professional
        FOREIGN KEY (professional_id) REFERENCES professional(id);

ALTER TABLE medical_record
    ADD CONSTRAINT fk_medical_record_patient
        FOREIGN KEY (patient_id) REFERENCES patient(id);

ALTER TABLE medical_record
    ADD CONSTRAINT fk_medical_record_schedule
        FOREIGN KEY (schedule_id) REFERENCES schedule(id);
