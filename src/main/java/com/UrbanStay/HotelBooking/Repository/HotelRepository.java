package com.UrbanStay.HotelBooking.Repository;

import com.UrbanStay.HotelBooking.Entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
