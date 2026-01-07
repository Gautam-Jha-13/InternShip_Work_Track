package com.example.mongo_crud.repository;

import com.example.mongo_crud.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
