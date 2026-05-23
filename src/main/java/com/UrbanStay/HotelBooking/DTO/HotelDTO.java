package com.UrbanStay.HotelBooking.DTO;

import com.UrbanStay.HotelBooking.Entity.HotelContactInfo;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
public class HotelDTO {

    private Long hotelId;
    private String hotelName;
    private String[] photos;
    private String[] amenities;
    private Boolean active;

    private HotelContactInfo contactInfo;
}
