package com.travelplanner.repository;

// Spring Data JPA support
import org.springframework.data.jpa.repository.JpaRepository;

// Import User entity
import com.travelplanner.entity.User;

// Repository for User table
public interface UserRepository extends JpaRepository<User, Long> {

    // Spring will automatically generate query from method name
    User findByEmail(String email);
}
