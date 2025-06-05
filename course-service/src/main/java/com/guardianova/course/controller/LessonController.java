package com.guardianova.course.controller;

import com.guardianova.course.model.Lesson;
import com.guardianova.course.service.LessonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lesson")
public class LessonController {

    private final LessonService service;

    public LessonController(LessonService service) {
        this.service = service;
    }

    @GetMapping
    public List<Lesson> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Lesson create(@RequestBody Lesson entity) {
        return service.save(entity);
    }
}
