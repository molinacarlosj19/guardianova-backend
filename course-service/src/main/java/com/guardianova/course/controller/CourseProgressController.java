package com.guardianova.course.controller;

import com.guardianova.course.model.CourseProgress;
import com.guardianova.course.service.CourseProgressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courseprogress")
public class CourseProgressController {

    private final CourseProgressService service;

    public CourseProgressController(CourseProgressService service) {
        this.service = service;
    }

    @GetMapping
    public List<CourseProgress> getAll() {
        return service.findAll();
    }

    @PostMapping
    public CourseProgress create(@RequestBody CourseProgress entity) {
        return service.save(entity);
    }
}
