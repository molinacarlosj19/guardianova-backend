package com.guardianova.diagnosis.model;

import jakarta.persistence.*;
import java.time.*;
import java.util.*;

@Entity
public class DiagnosisReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id;
    private Long userId;
    private LocalDate date;
    private Double riskScore;
    private List<String> suggestedCourses;

    // Getters and setters
}
