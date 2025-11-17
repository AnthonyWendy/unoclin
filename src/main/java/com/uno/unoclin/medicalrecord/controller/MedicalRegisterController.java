package com.uno.unoclin.medicalrecord.controller;

import com.uno.unoclin.entity.controller.EntityController;
import com.uno.unoclin.entity.service.EntityBaseService;
import com.uno.unoclin.medicalrecord.domain.MedicalRecord;
import com.uno.unoclin.schedule.domain.Schedule;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/medical-register")
public class MedicalRegisterController extends EntityController<MedicalRecord> {
    public MedicalRegisterController(EntityBaseService<MedicalRecord> service) {
        super(service);
    }
}
