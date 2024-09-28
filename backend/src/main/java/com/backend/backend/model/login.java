package com.backend.backend.model;

import jakarta.persistence.*;

public class login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generates the primary key

    @Column(name = "id")  // Maps to the 'id' column in the table
    private Long id;
    
    @Column(name = "email")
    private String email;
    @Column(name = "password")  // Maps to the 'password' column in the table
    private String password;

    @Column(name = "username")  // Maps to the 'username' column in the table
    private String username;

    // Default constructor
    public login() {}

    // Getters and setters for all fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
