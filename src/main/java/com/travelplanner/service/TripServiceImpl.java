package com.travelplanner.service;

// Spring annotation
import org.springframework.stereotype.Service;

// Repository import
import com.travelplanner.repository.TripRepository;

// Entity import
import com.travelplanner.entity.Trip;

import java.util.List;

// Marks this class as Service layer
@Service
public class TripServiceImpl implements TripService {

    // Inject TripRepository
    private final TripRepository tripRepository;

    // Constructor injection
    public TripServiceImpl(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    // Save a trip in database
    @Override
    public Trip createTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    // Fetch all trips for a user
    @Override
    public List<Trip> getTripsByUserId(Long userId) {
        return tripRepository.findByUserId(userId);
    }
}
