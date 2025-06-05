package com.guardianova.auth.controller;

import com.guardianova.auth.model.User;
import com.guardianova.auth.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getAll() {
        return service.findAll();
    }

    @PostMapping
    public User create(@RequestBody User entity) {
        return service.save(entity);
    }
}
