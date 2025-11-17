package com.uno.unoclin.medicalrecord.domain;

import com.uno.unoclin.entity.domain.EntityBase;
import com.uno.unoclin.patient.domain.Patient;
import com.uno.unoclin.professional.domain.Professional;
import com.uno.unoclin.schedule.domain.Schedule;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "medical_record")
public class MedicalRecord implements EntityBase, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull(message = "error.medical_record.professional.invalid")
    private Professional professional;

    @ManyToOne
    @NotNull(message = "error.medical_record.patient.invalid")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    @NotNull(message = "error.medical_record.register.invalid")
    private String register;

    @NotNull
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "date_time", nullable = false)
    @NotNull(message = "error.medical_record.datetime.invalid")
    private LocalDateTime dateTime;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "TEXT")
    private String diagnosis;

    @Column(columnDefinition = "TEXT")
    private String prescription;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

}
