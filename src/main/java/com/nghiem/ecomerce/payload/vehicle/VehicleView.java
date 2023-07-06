package com.nghiem.ecomerce.payload.vehicle;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class VehicleView {
    private String name;
    private String plateNumber;
    private String Content;
    private LocalDate manufactureDate;
    private int mileage;
    private float engineCapacity;
    private String transmission;
    private String fuelType;
    private String bodyType;
    private String color;
    private float price;
}
