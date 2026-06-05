package com.UrbanStay.HotelBooking.Services;

import com.UrbanStay.HotelBooking.DTO.RoomDTO;
import com.UrbanStay.HotelBooking.Entity.Hotel;
import com.UrbanStay.HotelBooking.Repository.HotelRepository;
import com.UrbanStay.HotelBooking.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
@Slf4j

public class RoomServiceImplementation implements RoomService{
    private final HotelRepository hotelRepository;
    private final ModelMapper modelMapper;

    @Override
    public RoomDTO createNewRoom(Long hotelId, RoomDTO roomDto) {
//        log.info("Creating the new Room");
//        Hotel hotel=hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Hotel not found"));

return null;
    }

    @Override
    public List<RoomDTO> getAllRoomsInHotel(Long hotelId) {
        return List.of();
    }

    @Override
    public RoomDTO getRoomById(Long roomId) {
        return null;
    }

    @Override
    public void deleteRoomById(Long roomId) {

    }
}
