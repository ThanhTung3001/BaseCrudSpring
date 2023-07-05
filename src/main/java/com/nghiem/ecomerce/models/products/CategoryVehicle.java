package com.nghiem.ecomerce.models.products;


import com.nghiem.ecomerce.models.BaseEntity;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "category_vehicles")
public class CategoryVehicle extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "categoryVehicle", fetch = FetchType.LAZY)
    private Set<Vehicle> vehicles;

    // constructors, getters, and setters

}
