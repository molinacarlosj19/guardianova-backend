package com.guardianova.legalbot.model;

import jakarta.persistence.*;
import java.time.*;
import java.util.*;

@Entity
public class DocumentVersion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id;
    private Long documentId;
    private int versionNumber;
    private String content;
    private LocalDateTime createdAt;

    // Getters and setters
}
