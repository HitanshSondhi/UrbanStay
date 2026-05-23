package com.UrbanStay.HotelBooking.DTO;

import com.UrbanStay.HotelBooking.Entity.Hotel;
import com.UrbanStay.HotelBooking.Entity.Room;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class InventoryDTO {

    private Long id;
    private Hotel hotel;
    private Room room;
    private LocalDateTime bookedAt;
    private Integer bookedCount;
    private Integer totalCount;
    private BigDecimal surgefactor;
    private BigDecimal price;
    private String city;
    private Boolean closed;
}

