package com.example.mongo_crud.service;

import com.example.mongo_crud.model.User;
import com.example.mongo_crud.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User createUser(User user) {
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User updateUser(String id, User user) {
        user.setId(id);
        return repository.save(user);
    }

    public void deleteUser(String id) {
        repository.deleteById(id);
    }
}
