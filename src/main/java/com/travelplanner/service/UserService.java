package com.travelplanner.service;

// Import User entity
import com.travelplanner.entity.User;

// Service interface = WHAT operations are allowed
public interface UserService {

    // Create a new user
    User createUser(User user);

    // Find user by email
    User getUserByEmail(String email);

    // Find user by id
    User getUserById(Long id);
}
