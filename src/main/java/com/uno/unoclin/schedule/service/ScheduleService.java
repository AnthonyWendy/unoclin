package com.uno.unoclin.schedule.service;

import com.uno.unoclin.entity.repository.EntityRepository;
import com.uno.unoclin.entity.service.EntityBaseService;
import com.uno.unoclin.schedule.domain.Schedule;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService extends EntityBaseService<Schedule> {

    public ScheduleService(EntityRepository<Schedule> repository) {
        super(repository);
    }
}
