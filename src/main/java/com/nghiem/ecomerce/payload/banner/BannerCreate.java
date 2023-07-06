package com.nghiem.ecomerce.payload.banner;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
public class BannerCreate {
    private String name;

    private String imageUrl;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
    private boolean active;

    private String link;
}
