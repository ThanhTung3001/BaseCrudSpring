package com.nghiem.ecomerce.models;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "created_by", nullable = false, updatable = false)
    private String createdBy;

    @Column(name = "updated_by")
    private String updatedBy;

    @PrePersist
    public void prePersist() {

        this.id = UUID.randomUUID();
        this.createdAt = LocalDateTime.now();
        this.createdBy = "system"; // or get the current user from Spring Security context
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
        this.updatedBy = "system"; // or get the current user from Spring Security context
    }

    // getters and setters

}