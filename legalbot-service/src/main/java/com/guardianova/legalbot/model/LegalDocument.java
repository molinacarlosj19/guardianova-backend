package com.guardianova.legalbot.model;

import jakarta.persistence.*;
import java.time.*;
import java.util.*;

@Entity
public class LegalDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id;
    private Long userId;
    private Long templateId;
    private String generatedContent;
    private String status;
    private LocalDateTime createdAt;

    // Getters and setters
}
