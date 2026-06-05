package com.UrbanStay.HotelBooking;

import com.UrbanStay.HotelBooking.Entity.User;
import com.UrbanStay.HotelBooking.Services.JWTService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HotelBookingApplicationTests {


	@Autowired
	private JWTService jwtService;
	@Test
	void contextLoads() {
		User user = new User(
				2L,
				"hitanshsondhi@gmail.com",
				"1234",
				null,
				null

		);
		String token = jwtService.generateToken(user);
		System.out.println(token);
		Long id = jwtService.getUserIdFromToken(token);
		System.out.println(id);
	}

}
