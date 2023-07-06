package com.nghiem.ecomerce.payload.branch;


import com.nghiem.ecomerce.payload.BaseUpdateEntity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BranchUpdate extends BaseUpdateEntity {
    public String name ;
}
