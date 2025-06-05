package com.guardianova.course.service;

import com.guardianova.course.model.Lesson;
import com.guardianova.course.repository.LessonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {

    private final LessonRepository repository;

    public LessonService(LessonRepository repository) {
        this.repository = repository;
    }

    public List<Lesson> findAll() {
        return repository.findAll();
    }

    public Lesson save(Lesson entity) {
        return repository.save(entity);
    }
}
