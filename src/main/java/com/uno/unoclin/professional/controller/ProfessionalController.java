package com.uno.unoclin.professional.controller;


import com.uno.unoclin.entity.controller.EntityController;
import com.uno.unoclin.entity.service.EntityBaseService;
import com.uno.unoclin.patient.domain.Patient;
import com.uno.unoclin.professional.domain.Professional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professional")
public class ProfessionalController extends EntityController<Professional>  {

    public ProfessionalController(EntityBaseService<Professional> service) {
        super(service);
    }
}
