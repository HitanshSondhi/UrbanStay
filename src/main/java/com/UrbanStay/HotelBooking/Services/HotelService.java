package com.UrbanStay.HotelBooking.Services;

import com.UrbanStay.HotelBooking.DTO.HotelDTO;

public interface HotelService {
    HotelDTO createNewHotel(HotelDTO hotelDTO);
    HotelDTO getHotelById(Long id);
    HotelDTO updateHotelById(Long id);
    Boolean deleteteHotelById(Long id);
    void activateHotel(Long hotelId);
}
