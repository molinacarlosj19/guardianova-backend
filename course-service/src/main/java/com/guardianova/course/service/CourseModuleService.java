package com.guardianova.course.service;

import com.guardianova.course.model.CourseModule;
import com.guardianova.course.repository.CourseModuleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseModuleService {

    private final CourseModuleRepository repository;

    public CourseModuleService(CourseModuleRepository repository) {
        this.repository = repository;
    }

    public List<CourseModule> findAll() {
        return repository.findAll();
    }

    public CourseModule save(CourseModule entity) {
        return repository.save(entity);
    }
}
