package com.uno.unoclin.entity.repository;

import com.uno.unoclin.entity.domain.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface EntityRepository<T extends Entity> extends JpaRepository<T, Long> {
    T search(String value);
}

