package com.guardianova.course.repository;

import com.guardianova.course.model.CourseProgress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseProgressRepository extends JpaRepository<CourseProgress, Long> {}
