package com.guardianova.course.model;

import jakarta.persistence.*;
import java.time.*;
import java.util.*;

@Entity
public class CourseModule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id;
    private String title;
    private String description;
    private String riskCategory;

    // Getters and setters
}
