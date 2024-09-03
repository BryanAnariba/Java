package com.hibernate.jpa.concepts.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

// TODO: esta clase debe estar en todas las entidades ya que es codigo reutilizable en este caso create y update at esa fecha debe ir en todas las entidades
@Embeddable()
public class Audit {
    @Column(name = "created_at", nullable = true)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

        // Ciclo de vida 1: antes de insertar un registro, en este caso que solo llene la fecha de creacion
    @PrePersist()
    public void prePersist() {
        System.out.println("Cycle Event PrePersist!!!!");
        this.createdAt = LocalDateTime.now();
    }

    // Ciclo de vida 2: antes de modificar un registro, en este caso que solo llene la fecha de actualizacion
    @PreUpdate()
    public void preUpdate() {
        System.out.println("Cycle Event PreUpdate!!!!!");
        this.updatedAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
