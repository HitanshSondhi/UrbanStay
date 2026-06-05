package com.UrbanStay.HotelBooking.Repository;

import com.UrbanStay.HotelBooking.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findbyEmail(String email);

}
