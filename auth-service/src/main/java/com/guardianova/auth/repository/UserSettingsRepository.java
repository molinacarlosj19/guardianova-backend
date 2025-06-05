package com.guardianova.auth.repository;

import com.guardianova.auth.model.UserSettings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSettingsRepository extends JpaRepository<UserSettings, Long> {}
