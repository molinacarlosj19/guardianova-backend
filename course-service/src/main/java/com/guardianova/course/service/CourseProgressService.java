package com.guardianova.course.service;

import com.guardianova.course.model.CourseProgress;
import com.guardianova.course.repository.CourseProgressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseProgressService {

    private final CourseProgressRepository repository;

    public CourseProgressService(CourseProgressRepository repository) {
        this.repository = repository;
    }

    public List<CourseProgress> findAll() {
        return repository.findAll();
    }

    public CourseProgress save(CourseProgress entity) {
        return repository.save(entity);
    }
}
