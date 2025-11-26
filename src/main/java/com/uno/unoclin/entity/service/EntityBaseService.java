package com.uno.unoclin.entity.service;

import com.uno.unoclin.entity.domain.EntityBase;
import com.uno.unoclin.entity.repository.EntityRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;


public abstract class EntityBaseService<T extends EntityBase> {

    protected final EntityRepository<T> repository;

    public EntityBaseService(EntityRepository<T> repository) {
        this.repository = repository;
    }

    @Transactional
    public T save(T entity) {

        beforeSave(entity);

        return repository.save(entity);
    }

    @Transactional
    public T update(T entity) {

        if (entity.getId() == null) {
            throw new RuntimeException("ID cannot be null for update.");
        }

        T existing = repository.findById(entity.getId())
                .orElseThrow(() ->
                        new RuntimeException("Entity not found: " + entity.getId())
                );

        // Cópia ignorando o ID
        BeanUtils.copyProperties(entity, existing, "id");

        return repository.save(existing);
    }

    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }

    public T findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public void beforeSave(T entity) {
    }
}
