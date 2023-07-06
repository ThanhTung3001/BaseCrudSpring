package com.nghiem.ecomerce.payload;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
public class BaseViewEntity {

    public UUID id;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;

}
