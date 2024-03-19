package com.example.springstub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
@RestController
public class Controller {
    @GetMapping("/api/get")
    public String getData() {
        return "{\"message\": \"Nothing here\"}";
    }

    @PostMapping("/api/post")
    public Map<String, Object> login(@RequestBody Map<String, String> credentials) {
        Map<String, Object> response = new HashMap<>();
        response.put("login", credentials.get("login"));
        response.put("password", credentials.get("password"));
        response.put("timestamp", LocalDateTime.now());
        return response;
    }
}
