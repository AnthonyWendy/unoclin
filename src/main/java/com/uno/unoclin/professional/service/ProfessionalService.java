package com.uno.unoclin.professional.service;

import com.uno.unoclin.entity.repository.EntityRepository;
import com.uno.unoclin.entity.service.EntityBaseService;
import com.uno.unoclin.professional.domain.Professional;
import org.springframework.stereotype.Service;

@Service
public class ProfessionalService extends EntityBaseService<Professional> {

    public ProfessionalService(EntityRepository<Professional> repository) {
        super(repository);
    }
}
