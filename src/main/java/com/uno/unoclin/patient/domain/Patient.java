package com.uno.unoclin.patient.domain;


import com.uno.unoclin.entity.domain.EntityBase;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "patient")
public class Patient implements Serializable, EntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "error.professional.name.null")
    private String name;

    @NotNull(message = "error.professional.cpf.null")
    @Size(max = 14)
    private String cpf;

    @NotNull(message = "error.professional.phone_number.null")
    private String phoneNumber;

    @NotNull(message = "error.professional.email.null")
    private String email;

    @Past(message = "error.patient.born.invalided")
    private LocalDate bornDate;

    @Pattern(regexp = "M|F", message = "error.patient.gender.invalided")
    private String gender;

    @Size(max = 100)
    private String address;
}
