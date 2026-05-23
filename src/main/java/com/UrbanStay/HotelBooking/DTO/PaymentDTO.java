package com.UrbanStay.HotelBooking.DTO;

import com.UrbanStay.HotelBooking.Entity.enums.PaymentStatus;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PaymentDTO {

    private Long id;
    private String transactionId;
    private PaymentStatus paymentStatus;
    private BigDecimal amount;
}

