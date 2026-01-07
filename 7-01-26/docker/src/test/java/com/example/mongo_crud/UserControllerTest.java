package com.example.mongo_crud;

import com.example.mongo_crud.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserControllerTest {

    @Test
    void testUserModel() {
        User user = new User("1", "Test", "test@test.com");
        assertEquals("Test", user.getName());
    }
}
