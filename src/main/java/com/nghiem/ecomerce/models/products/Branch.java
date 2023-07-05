package com.nghiem.ecomerce.models.products;

import com.nghiem.ecomerce.models.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Entity
@Table(name = "branches")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Branch extends BaseEntity {

    @Column(nullable = false)
    public String name;

    @OneToMany(mappedBy = "branch", fetch = FetchType.LAZY)
    private Set<Vehicle> vehicles;

    // constructors, getters, and setters

}