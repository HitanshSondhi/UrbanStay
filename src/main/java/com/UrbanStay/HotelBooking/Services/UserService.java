package com.UrbanStay.HotelBooking.Services;

import com.UrbanStay.HotelBooking.DTO.SignupDTO;
import com.UrbanStay.HotelBooking.DTO.UserDTO;
import com.UrbanStay.HotelBooking.Entity.User;
import com.UrbanStay.HotelBooking.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.BadCredentialsException;

import java.util.Optional;

@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserDTO signUp(SignupDTO signupDTO) {
        Optional<User> user= userRepository.findbyEmail(signupDTO.getEmail());
        if(user.isPresent()){
            throw new BadCredentialsException("User with this email already exists");
        }
        User tocreate=modelMapper.map(signupDTO,User.class);
        User saved=userRepository.save(tocreate);
        return modelMapper.map(saved,UserDTO.class);

    }
}
