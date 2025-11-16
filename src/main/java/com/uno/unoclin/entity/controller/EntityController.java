package com.uno.unoclin.entity.controller;

import com.uno.unoclin.entity.domain.Entity;
import com.uno.unoclin.service.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class EntityController<T extends Entity> {

    protected final BaseService<T> service;

    public EntityController(BaseService<T> service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<T> create(@RequestBody T entity) {
        T saved = service.save(entity);
        return ResponseEntity.ok(saved);
    }

    @PutMapping
    public ResponseEntity<T> update(@RequestBody T entity) {

        T updated = service.update(entity);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable Long id) {
        T entity = service.findById(id);
        if (entity == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(entity);
    }

    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
