package com.guardianova.auth.model;

import jakarta.persistence.*;
import java.time.*;
import java.util.*;

@Entity
public class UserSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id;
    private Long userId;
    private String notificationPrefs;
    private Boolean complianceEmailOptIn;

    // Getters and setters
}
