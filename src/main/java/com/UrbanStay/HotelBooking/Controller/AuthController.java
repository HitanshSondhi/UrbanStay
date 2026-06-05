package com.UrbanStay.HotelBooking.Controller;

import com.UrbanStay.HotelBooking.DTO.SignupDTO;
import com.UrbanStay.HotelBooking.DTO.UserDTO;
import com.UrbanStay.HotelBooking.Services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final  UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<UserDTO>  signup(@RequestBody SignupDTO signupDTO) {
        UserDTO  userDTO= userService.signUp(signupDTO);



    }
}
