package com.uno.unoclin.professional.domain;

import com.uno.unoclin.entity.domain.EntityBase;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "professional")
public class Professional implements Serializable, EntityBase {

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
    @Email(message = "error.professional.email.invalid")
    private String email;

    @Past(message = "error.professional.born.invalid")
    private LocalDate bornDate;

    @Pattern(regexp = "M|F", message = "error.professional.gender.invalid")
    private String gender;

    @Size(max = 100)
    private String address;

    @NotNull(message = "error.professional.specialty.null")
    private String specialty;

    @NotNull(message = "error.professional.registration.null")
    private String professionalRegistration;
}
