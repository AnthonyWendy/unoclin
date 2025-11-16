CREATE TABLE schedule (
          id BIGSERIAL PRIMARY KEY,
          professional_id BIGINT NOT NULL,
          patient_id BIGINT NOT NULL,
          start TIMESTAMP NOT NULL,
          end_at TIMESTAMP NOT NULL,
          status VARCHAR(50) NOT NULL,
          observation TEXT,

          CONSTRAINT fk_schedule_professional
              FOREIGN KEY (professional_id)
                  REFERENCES professional(id)
                  ON DELETE RESTRICT,

          CONSTRAINT fk_schedule_patient
              FOREIGN KEY (patient_id)
                  REFERENCES patient(id)
                  ON DELETE RESTRICT
);
