package com.UrbanStay.HotelBooking.DTO;

import com.UrbanStay.HotelBooking.Entity.Hotel;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RoomDTO {
    private Long id;
    private Hotel hotel;
    private String type;
    private BigDecimal price;
    private String[] amenities;
    private String[] photos;
    private Integer totalCount;
    private Integer capacity;




}
