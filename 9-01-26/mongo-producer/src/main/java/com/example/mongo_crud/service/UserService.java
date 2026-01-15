package com.example.mongo_crud.service;

import com.example.mongo_crud.model.User;
import com.example.mongo_crud.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "user-events";

    public User createUser(User user) {
        User savedUser = repository.save(user);

        // 🔥 PRODUCE EVENT TO KAFKA
        kafkaTemplate.send(
                TOPIC,
                "User Created → Name: " + user.getName() + ", Email: " + user.getEmail()
        );

        return savedUser;
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User updateUser(String id, User user) {
        user.setId(id);
        User updated = repository.save(user);

        kafkaTemplate.send(TOPIC, "User Updated → ID: " + id);
        return updated;
    }

    public void deleteUser(String id) {
        repository.deleteById(id);
        kafkaTemplate.send(TOPIC, "User Deleted → ID: " + id);
    }
}
