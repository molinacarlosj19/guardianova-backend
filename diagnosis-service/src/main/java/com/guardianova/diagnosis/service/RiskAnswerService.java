package com.guardianova.diagnosis.service;

import com.guardianova.diagnosis.model.RiskAnswer;
import com.guardianova.diagnosis.repository.RiskAnswerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskAnswerService {

    private final RiskAnswerRepository repository;

    public RiskAnswerService(RiskAnswerRepository repository) {
        this.repository = repository;
    }

    public List<RiskAnswer> findAll() {
        return repository.findAll();
    }

    public RiskAnswer save(RiskAnswer entity) {
        return repository.save(entity);
    }
}
