package com.nghiem.ecomerce.payload.category;

import com.nghiem.ecomerce.payload.BaseUpdateEntity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoryUpdate extends BaseUpdateEntity {
    private String name;
}
