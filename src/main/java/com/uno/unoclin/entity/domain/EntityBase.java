package com.uno.unoclin.entity.domain;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public interface EntityBase {
    Long getId();
}
