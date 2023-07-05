package com.nghiem.ecomerce.models.banners;

import com.nghiem.ecomerce.models.BaseEntity;
import jakarta.persistence.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "banners")
public class Banner extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private LocalDateTime startDate;

    @Column(nullable = false)
    private LocalDateTime endDate;

    @Column(nullable = false)
    private boolean active;

    @Column(nullable = false)
    private String link;

    // constructors, getters, and setters
}