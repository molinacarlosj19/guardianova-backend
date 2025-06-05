package com.guardianova.auth.service;

import com.guardianova.auth.model.UserSettings;
import com.guardianova.auth.repository.UserSettingsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSettingsService {

    private final UserSettingsRepository repository;

    public UserSettingsService(UserSettingsRepository repository) {
        this.repository = repository;
    }

    public List<UserSettings> findAll() {
        return repository.findAll();
    }

    public UserSettings save(UserSettings entity) {
        return repository.save(entity);
    }
}
