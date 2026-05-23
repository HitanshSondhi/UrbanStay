package com.UrbanStay.HotelBooking.DTO;

import com.UrbanStay.HotelBooking.Entity.User;
import com.UrbanStay.HotelBooking.Entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDTO {

    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}

