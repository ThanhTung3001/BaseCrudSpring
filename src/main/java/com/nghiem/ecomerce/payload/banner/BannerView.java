package com.nghiem.ecomerce.payload.banner;

import com.nghiem.ecomerce.payload.BaseViewEntity;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
public class BannerView extends BaseViewEntity {
    private String name;

    private String imageUrl;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
    private boolean active;

    private String link;
}
