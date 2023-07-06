package com.nghiem.ecomerce.payload.user;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class UserView {
    private String Address;
    private String FullName;
    private LocalDateTime DateOfBirth;
}
