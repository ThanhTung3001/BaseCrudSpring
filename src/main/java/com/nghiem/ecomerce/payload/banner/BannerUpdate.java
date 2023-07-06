package com.nghiem.ecomerce.payload.banner;

import com.nghiem.ecomerce.payload.BaseUpdateEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
public class BannerUpdate extends BaseUpdateEntity {
    private String name;

    private String imageUrl;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
    private boolean active;

    private String link;
}
