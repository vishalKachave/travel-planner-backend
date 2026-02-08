package com.travelplanner.service;

// Import Trip entity
import com.travelplanner.entity.Trip;

import java.util.List;

// Service interface = WHAT trip operations are allowed
public interface TripService {

    // Create a new trip
    Trip createTrip(Trip trip);

    // Get all trips of a specific user
    List<Trip> getTripsByUserId(Long userId);
}
