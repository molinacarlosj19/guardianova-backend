package com.guardianova.auth.service;

import com.guardianova.auth.model.User;
import com.guardianova.auth.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User save(User entity) {
        return repository.save(entity);
    }
}
