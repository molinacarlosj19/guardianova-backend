package com.guardianova.auth.model;

import jakarta.persistence.*;
import java.time.*;
import java.util.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String role;
    private LocalDateTime createdAt;

    // Getters and setters
}
