package com.UrbanStay.HotelBooking.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name="hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelId;

    @Column(nullable = false)
    private String hotelName;

    @Column(columnDefinition = "TEXT[]")
    private String[] photos;


    @Column(columnDefinition = "TEXT[]")
    private String[] amenities;

    private Boolean active;


//    @Column(nullable = false)
//    private Integer totalCount;
//
//    private Integer capacity;


    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;


    @Embedded
    private HotelContactInfo contactInfo;
}
