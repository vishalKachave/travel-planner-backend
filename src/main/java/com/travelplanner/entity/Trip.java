package com.travelplanner.entity;

// JPA annotations
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

// Marks this class as a database table
@Entity
public class Trip {

    // Primary key of trip table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Name of the trip
    private String name;

    // Trip destination
    private String destination;

    // Many trips can belong to one user
    @ManyToOne
    // Foreign key column in trip table pointing to user table
    @JoinColumn(name = "user_id")
    private User user;

    // Default constructor required by JPA
    public Trip() {
    }

    // Constructor without id (id auto-generated)
    public Trip(String name, String destination, User user) {
        this.name = name;
        this.destination = destination;
        this.user = user;
    }

    // Getter and Setter methods

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
