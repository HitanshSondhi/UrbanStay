package com.UrbanStay.HotelBooking.DTO;

import com.UrbanStay.HotelBooking.Entity.Booking;
import com.UrbanStay.HotelBooking.Entity.Guest;
import com.UrbanStay.HotelBooking.Entity.Hotel;
import com.UrbanStay.HotelBooking.Entity.Payment;
import com.UrbanStay.HotelBooking.Entity.Room;
import com.UrbanStay.HotelBooking.Entity.User;
import com.UrbanStay.HotelBooking.Entity.enums.BookingStatus;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingDTO {

    private Long id;
    private Hotel hotel;
    private Room room;
    private User user;
    private Integer roomCounts;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Payment payment;
    private BookingStatus bookingStatus;
    private Set<Guest> guests;
}

