package com.travelplanner.repository;

import com.travelplanner.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Marks this as a Spring repository bean
public interface RoleRepository extends JpaRepository<Role, Long> {
    // JpaRepository provides all CRUD operations automatically
    // <Role, Long> → Role is entity, Long is type of primary key
}
