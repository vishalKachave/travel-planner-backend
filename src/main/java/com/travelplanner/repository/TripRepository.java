package com.travelplanner.repository;

// Spring Data JPA support
import org.springframework.data.jpa.repository.JpaRepository;

// Import Trip entity
import com.travelplanner.entity.Trip;

// Repository for Trip table
public interface TripRepository extends JpaRepository<Trip, Long> {

    // Fetch all trips created by a specific user
    // Spring will auto-generate query using user_id (foreign key)
    java.util.List<Trip> findByUserId(Long userId);
}
