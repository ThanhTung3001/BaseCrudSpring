package com.nghiem.ecomerce.models.products;

import com.nghiem.ecomerce.models.BaseEntity;
import com.nghiem.ecomerce.models.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class OrderVehicle extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User buyer;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OrderStatus status;
    // constructors, getters, and setters
}
