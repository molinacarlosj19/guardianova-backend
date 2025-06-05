package com.guardianova.diagnosis.repository;

import com.guardianova.diagnosis.model.RiskQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskQuestionRepository extends JpaRepository<RiskQuestion, Long> {}
