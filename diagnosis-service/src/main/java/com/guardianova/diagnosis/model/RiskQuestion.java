package com.guardianova.diagnosis.model;

import jakarta.persistence.*;
import java.time.*;
import java.util.*;

@Entity
public class RiskQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id;
    private String text;
    private String category;
    private Boolean isOptional;

    // Getters and setters
}
