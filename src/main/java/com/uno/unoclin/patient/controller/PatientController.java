package com.uno.unoclin.patient.controller;

import com.uno.unoclin.entity.controller.EntityController;
import com.uno.unoclin.entity.service.EntityBaseService;
import com.uno.unoclin.patient.domain.Patient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController extends EntityController<Patient> {
    public PatientController(EntityBaseService<Patient> service) {
        super(service);
    }
}
