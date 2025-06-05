package com.guardianova.legalbot.model;

import jakarta.persistence.*;
import java.time.*;
import java.util.*;

@Entity
public class LegalTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id;
    private String title;
    private String jurisdiction;
    private String type;
    private String contentTemplate;

    // Getters and setters
}
