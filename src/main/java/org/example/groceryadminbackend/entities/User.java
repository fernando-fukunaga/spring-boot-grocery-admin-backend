package org.example.groceryadminbackend.entities;

import org.example.groceryadminbackend.entities.Roles;

public class User {
    private int private_id;
    private String public_id;
    private String username;
    private String email;
    private String password;
    private Roles role;
    private boolean active;

    public User(String public_id, String username, String email, String password, Roles role, boolean active) {
        this.public_id = public_id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.active = active;
    }

    public int getPrivate_id() {
        return private_id;
    }

    public void setPrivate_id(int private_id) {
        this.private_id = private_id;
    }

    public String getPublic_id() {
        return public_id;
    }

    public void setPublic_id(String public_id) {
        this.public_id = public_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
