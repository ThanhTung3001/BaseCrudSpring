package com.nghiem.ecomerce.payload.order;

import com.nghiem.ecomerce.models.products.OrderStatus;
import com.nghiem.ecomerce.payload.user.UserView;
import com.nghiem.ecomerce.payload.vehicle.VehicleView;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class OrderView {
    private VehicleView vehicle;
    private UserView buyer;
    private float price;
    private LocalDateTime orderDate;
    private OrderStatus status;
}
