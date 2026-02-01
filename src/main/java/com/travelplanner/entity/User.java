package com.travelplanner.entity; 
// Package where this class belongs (entity = DB table mapping)

import jakarta.persistence.*; 
// JPA annotations like @Entity, @Id, @ManyToOne

import java.time.LocalDateTime; 
// To store date & time (createdAt)

/**
 * Marks this class as a database table
 */
@Entity  

/**
 * Maps this class to "users" table in database
 */
@Table(name = "users")
public class User {

    /**
     * Primary Key of users table
     */
    @Id  

    /**
     * Auto-increment ID (1,2,3...)
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * User's full name
     */
    private String name;

    /**
     * User's email address
     */
    private String email;

    /**
     * Encrypted password
     */
    private String password;

    /**
     * Many users can have ONE role
     * Example: many users → USER role
     */
    @ManyToOne  

    /**
     * Foreign key column in users table
     * role_id references roles.id
     */
    @JoinColumn(name = "role_id")
    private Role role;

    /**
     * Date & time when user was created
     */
    private LocalDateTime createdAt;
}
