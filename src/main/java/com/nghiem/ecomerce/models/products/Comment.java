package com.nghiem.ecomerce.models.products;

import com.nghiem.ecomerce.models.BaseEntity;
import com.nghiem.ecomerce.models.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment extends BaseEntity {

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private LocalDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    // getters and setters for all fields

}