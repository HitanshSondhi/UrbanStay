package com.UrbanStay.HotelBooking.DTO;

import com.UrbanStay.HotelBooking.Entity.enums.Role;
import lombok.Data;

import java.util.Set;

@Data
public class UserDTO {

    private Long userId;
    private String email;
    private String password;
    private String name;
    private Set<Role> roles;
}

