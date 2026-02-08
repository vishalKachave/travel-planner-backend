package com.travelplanner.controller;

import org.springframework.web.bind.annotation.*;
import com.travelplanner.service.TripService;
import com.travelplanner.entity.Trip;

import java.util.List;

@RestController   // Marks this class as REST API controller
@RequestMapping("/trips")   // Base URL: /trips
public class TripController {

    private final TripService tripService;

    // Constructor Injection
    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    // Create new trip
    @PostMapping
    public Trip createTrip(@RequestBody Trip trip) {
        return tripService.createTrip(trip);
    }

    // Get all trips by user ID
    @GetMapping("/user/{userId}")
    public List<Trip> getTripsByUserId(@PathVariable Long userId) {
        return tripService.getTripsByUserId(userId);
    }
}
