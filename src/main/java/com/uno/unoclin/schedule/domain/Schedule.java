package com.uno.unoclin.schedule.domain;

import com.uno.unoclin.entity.domain.EntityBase;
import com.uno.unoclin.patient.domain.Patient;
import com.uno.unoclin.professional.domain.Professional;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "schedule")
public class Schedule implements EntityBase, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "professional_id", nullable = false)
    @NotNull(message = "error.schedule.professional.invalid")
    private Professional professional;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    @NotNull(message = "error.schedule.patient.invalid")
    private Patient patient;

    @NotNull(message = "error.schedule.start.invalid")
    private LocalDateTime start;

    @NotNull(message = "error.schedule.end_at.invalid")
    private LocalDateTime endAt;

    @NotNull(message = "error.schedule.status.invalid")
    @Enumerated(EnumType.STRING)
    private StatusSchedule status;

    private String observation;

}
