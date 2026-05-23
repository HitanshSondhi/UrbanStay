package com.UrbanStay.HotelBooking.Repository;

import com.UrbanStay.HotelBooking.Entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
