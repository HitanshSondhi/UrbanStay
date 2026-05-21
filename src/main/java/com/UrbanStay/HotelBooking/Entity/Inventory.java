package com.UrbanStay.HotelBooking.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter

@Table(
        uniqueConstraints = @UniqueConstraint(name = "unique_booking", columnNames = {"hotel_id", "room_id", "bookedAt"})
)
public class Inventory {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="hotel_id",nullable = false)
    private Hotel hotel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="room_id",nullable = false)
    private Room room;

    @Column(nullable=false)
    private LocalDateTime bookedAt;

    @Column(nullable=false,columnDefinition = "integer default 0")
    private Integer bookedCount;

    @Column(nullable=false)
    private Integer totalCount;

    @Column(nullable=false,precision=2,scale=2)
    private BigDecimal surgefactor;

    @Column(nullable=false,precision=10,scale=2)
    private BigDecimal price;

    @Column(nullable=false)
    private String city;

    @Column(nullable=false)
    private Boolean closed;


}
