package com.guardianova.auth.controller;

import com.guardianova.auth.model.UserSettings;
import com.guardianova.auth.service.UserSettingsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usersettings")
public class UserSettingsController {

    private final UserSettingsService service;

    public UserSettingsController(UserSettingsService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserSettings> getAll() {
        return service.findAll();
    }

    @PostMapping
    public UserSettings create(@RequestBody UserSettings entity) {
        return service.save(entity);
    }
}
