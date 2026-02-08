package com.travelplanner.repository;

// Spring Data JPA repository support
import org.springframework.data.jpa.repository.JpaRepository;

// Import Role entity
import com.travelplanner.entity.Role;

// This interface handles DB operations for Role table
public interface RoleRepository extends JpaRepository<Role, Long> {
    // No code needed now
    // JpaRepository already provides save(), findById(), findAll(), delete()
}
