package com.example.mongo_crud.controller;

import com.example.mongo_crud.model.User;
import com.example.mongo_crud.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173") // ✅ IMPORTANT for React
public class UserController {

    private final UserService service;

    // CREATE
    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    // READ ALL
    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    // UPDATE
    @PutMapping("/{id}")
    public User updateUser(
            @PathVariable String id,
            @RequestBody User user
    ) {
        return service.updateUser(id, user);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        service.deleteUser(id);
        return "User deleted successfully";
    }
}
