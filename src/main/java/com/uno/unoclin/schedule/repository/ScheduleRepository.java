package com.uno.unoclin.schedule.repository;

import com.uno.unoclin.entity.repository.EntityRepository;
import com.uno.unoclin.schedule.domain.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends EntityRepository<Schedule> {
}
