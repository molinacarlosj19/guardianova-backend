package com.guardianova.diagnosis.service;

import com.guardianova.diagnosis.model.RiskQuestion;
import com.guardianova.diagnosis.repository.RiskQuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskQuestionService {

    private final RiskQuestionRepository repository;

    public RiskQuestionService(RiskQuestionRepository repository) {
        this.repository = repository;
    }

    public List<RiskQuestion> findAll() {
        return repository.findAll();
    }

    public RiskQuestion save(RiskQuestion entity) {
        return repository.save(entity);
    }
}
