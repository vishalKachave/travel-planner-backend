package com.travelplanner.entity;

// JPA annotation imports
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

// Marks this class as a database table
@Entity
public class User {

    // Primary key of user table
    @Id
    // Auto-increment value (1,2,3...)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Stores user's name
    private String name;

    // Stores user's email
    private String email;

    // Stores user's password (encrypted later)
    private String password;

    // Many users can have the same role (USER / ADMIN)
    @ManyToOne
    // Creates role_id column in user table (foreign key)
    @JoinColumn(name = "role_id")
    private Role role;

    // Default constructor required by JPA
    public User() {
    }

    // Constructor without id (id is auto-generated)
    public User(String name, String email, String password, Role role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
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

    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public Role getRole() {
        return role;
    }
 
    public void setRole(Role role) {
        this.role = role;
    }
}
