package com.UrbanStay.HotelBooking.Controller;


import com.UrbanStay.HotelBooking.DTO.HotelDTO;
import com.UrbanStay.HotelBooking.Services.HotelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/hotels")
@RequiredArgsConstructor
@Slf4j
public class HotelAdminController {
    private final HotelService hotelService;

    @PostMapping
        public ResponseEntity<HotelDTO> createHotel(@RequestBody HotelDTO hotelDTO) {
        log.info("Attempting to create New Hotel");
        HotelDTO hotel=hotelService.createNewHotel(hotelDTO);
        return new ResponseEntity<>(hotel, HttpStatus.CREATED);

        }

     @GetMapping("/{hotelId}")
     public ResponseEntity<HotelDTO> getHotelById(@PathVariable("hotelId") Long hotelId) {
         HotelDTO hotel=hotelService.getHotelById(hotelId);
         return ResponseEntity.ok(hotel);

     }

      @DeleteMapping("/{hotelId}")
      public ResponseEntity<String> deleteHotel(@PathVariable("hotelId") Long hotelId) {
          log.info("Attempting to delete hotel with id: {}", hotelId);
          Boolean deleted = hotelService.deleteteHotelById(hotelId);
          if (deleted) {
              log.info("Hotel deleted successfully with id: {}", hotelId);
              return ResponseEntity.ok("Hotel deleted successfully");
          }
          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                  .body("Failed to delete hotel");
      }

      @PatchMapping("/{hotelId}/activate")
      public ResponseEntity<HotelDTO> activateHotel(@PathVariable("hotelId") Long hotelId) {
          log.info("Attempting to activate hotel with id: {}", hotelId);
          HotelDTO hotel = hotelService.activateHotelById(hotelId);
          return ResponseEntity.ok(hotel);
      }

      @PutMapping("/{hotelId}")
      public ResponseEntity<HotelDTO> updateHotelById(@PathVariable("hotelId") Long hotelId){
         HotelDTO hotel=hotelService.updateHotelById(hotelId);
          return ResponseEntity.ok(hotel);
      }

}
