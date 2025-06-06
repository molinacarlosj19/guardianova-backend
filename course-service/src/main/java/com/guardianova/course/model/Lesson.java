package com.guardianova.course.model;

import jakarta.persistence.*;
import java.time.*;
import java.util.*;

@Entity
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long moduleId;
    private String title;
    private String content;
    private String mediaUrl;

    // Getters and setters
}
