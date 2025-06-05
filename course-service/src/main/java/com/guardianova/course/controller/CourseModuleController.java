package com.guardianova.course.controller;

import com.guardianova.course.model.CourseModule;
import com.guardianova.course.service.CourseModuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coursemodule")
public class CourseModuleController {

    private final CourseModuleService service;

    public CourseModuleController(CourseModuleService service) {
        this.service = service;
    }

    @GetMapping
    public List<CourseModule> getAll() {
        return service.findAll();
    }

    @PostMapping
    public CourseModule create(@RequestBody CourseModule entity) {
        return service.save(entity);
    }
}
