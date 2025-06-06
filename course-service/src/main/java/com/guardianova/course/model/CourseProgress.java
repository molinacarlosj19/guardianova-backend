package com.guardianova.course.model;

import jakarta.persistence.*;
import java.time.*;
import java.util.*;

@Entity
public class CourseProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long moduleId;
    private LocalDateTime completedAt;

    // Getters and setters
}
