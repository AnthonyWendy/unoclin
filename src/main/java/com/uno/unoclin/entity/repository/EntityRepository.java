package com.uno.unoclin.entity.repository;

import com.uno.unoclin.entity.domain.EntityBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
public interface EntityRepository<T extends EntityBase> extends JpaRepository<T, Long> {


}

