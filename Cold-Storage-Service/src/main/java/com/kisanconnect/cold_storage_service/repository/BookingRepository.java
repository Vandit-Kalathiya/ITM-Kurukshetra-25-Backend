package com.kisanconnect.cold_storage_service.repository;

import com.kisanconnect.cold_storage_service.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, String> {
    List<Booking> findByFarmerId(String farmerId);
}