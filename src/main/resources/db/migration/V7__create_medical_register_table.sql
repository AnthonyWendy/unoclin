CREATE TABLE medical_record (
            id BIGSERIAL PRIMARY KEY,

            professional_id BIGINT NOT NULL,
            patient_id BIGINT NOT NULL,
            schedule_id BIGINT,

            created_at TIMESTAMP NOT NULL DEFAULT NOW(),

            description TEXT NOT NULL,
            diagnosis TEXT,
            prescription TEXT,
            attachments TEXT
);
