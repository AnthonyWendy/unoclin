package com.uno.unoclin.schedule.controller;

import com.uno.unoclin.entity.controller.EntityController;
import com.uno.unoclin.entity.service.EntityBaseService;
import com.uno.unoclin.schedule.domain.Schedule;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/schedule")
public class ScheduleController extends EntityController<Schedule> {

    public ScheduleController(EntityBaseService<Schedule> service) {
        super(service);
    }
}
