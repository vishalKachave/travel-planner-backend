package com.travelplanner.controller;

import org.springframework.web.bind.annotation.*;
import com.travelplanner.service.UserService;
import com.travelplanner.entity.User;

@RestController  // Marks this class as REST API controller
@RequestMapping("/users")  // Base URL: /users
public class UserController {

    private final UserService userService;

    // Constructor Injection
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Create new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // Get user by ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // Get user by email
    @GetMapping("/email/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }
}
