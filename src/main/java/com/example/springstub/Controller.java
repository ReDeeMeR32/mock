package com.example.springstub;

import org.apache.coyote.BadRequestException;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
@RestController
public class Controller {
    @GetMapping("/api/get")
    public ResponseEntity<?> getData() {
        return ResponseEntity.ok(new User("jojo", "bean"));
    }

    @PostMapping("/api/post")
    public User login(@RequestBody User user) throws Exception {
        if (user.getLogin() == null || user.getPassword() == null) {
            throw new Exception("Missing login or password");
        }

        user.setTimeNow(LocalDateTime.now());
        return user;
    }
}
