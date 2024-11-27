package org.example.groceryadminbackend.usecases;

import org.example.groceryadminbackend.entities.User;

public interface UserUseCases {
    public User createUser(User user);
    public User getUserById(String public_id);
    public User getUserByUsername(String username);
    public User getUserByEmail(String email);
    public User updateUser(User user);
    public User deactivateUser(User user);
}
