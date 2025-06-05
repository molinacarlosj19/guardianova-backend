package com.guardianova.diagnosis.model;

import jakarta.persistence.*;
import java.time.*;
import java.util.*;

@Entity
public class RiskAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id;
    private Long questionId;
    private Long userId;
    private String answerValue;

    // Getters and setters
}
