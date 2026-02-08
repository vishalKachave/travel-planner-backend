package com.travelplanner.entity;

// JPA annotation: tells Spring that this class maps to a database table
import jakarta.persistence.Entity;

// Marks this class as a database entity (table)
@Entity
public class Role {

    // Marks this field as primary key of the table
    @jakarta.persistence.Id
    // Tells DB to auto-generate value (1,2,3...)
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    // Column to store role name like ADMIN, USER
    private String name;

    // Default constructor required by JPA
    public Role() {
    }

    // Constructor to create role with name
    public Role(String name) {
        this.name = name;
    }

    // Getter for id
    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for role name
    public String getName() {
        return name;
    }

    // Setter for role name
    public void setName(String name) {
        this.name = name;
    }
}
