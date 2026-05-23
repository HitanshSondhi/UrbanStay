package com.UrbanStay.HotelBooking.Services;


import com.UrbanStay.HotelBooking.DTO.HotelDTO;
import com.UrbanStay.HotelBooking.Entity.Hotel;
import com.UrbanStay.HotelBooking.Repository.HotelRepository;
import com.UrbanStay.HotelBooking.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class HotelServiceImplementation implements HotelService {


    private final HotelRepository hotelRepository;
    private final ModelMapper modelMapper;

    @Override
    public HotelDTO createNewHotel(HotelDTO hotelDTO) {
        Hotel hotel=modelMapper.map(hotelDTO, Hotel.class);
        log.info("Creating a new hotel:{}",hotelDTO.getHotelName());
        hotel.setActive(false);
        hotel=hotelRepository.save(hotel);
        log.info("Hotel created:{}",hotel.getHotelId());
        return modelMapper.map(hotel, HotelDTO.class);

    }

    @Override
    public HotelDTO getHotelById(Long id) {
        log.info("Get a hotel by id:{}",id);
        Hotel hotel = hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel id not found"));
        return modelMapper.map(hotel, HotelDTO.class);
    }

    @Override
    public HotelDTO updateHotelById(Long id) {
        log.info("Update hotel by id:{}",id);
        Hotel hotel = hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel id not found"));
        hotel=hotelRepository.save(hotel);
        return modelMapper.map(hotel, HotelDTO.class);
    }

    @Override
    public Boolean deleteteHotelById(Long id) {
        log.info("deleting hotel by id:{}",id);
        Hotel hotel = hotelRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel id not found"));
        hotelRepository.delete(hotel);
        return true;

    }
}
