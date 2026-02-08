package com.travelplanner.service;

// Spring annotations
import org.springframework.stereotype.Service;

// Import repository
import com.travelplanner.repository.UserRepository;

// Import entity
import com.travelplanner.entity.User;

// Marks this class as a Service (business logic layer)
@Service
public class UserServiceImpl implements UserService {

    // Repository is injected by Spring (Dependency Injection)
    private final UserRepository userRepository;

    // Constructor injection (recommended way)
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create new user
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Get user by email
    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Get user by id
    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
