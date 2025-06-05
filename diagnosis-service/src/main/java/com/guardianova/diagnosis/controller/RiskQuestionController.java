package com.guardianova.diagnosis.controller;

import com.guardianova.diagnosis.model.RiskQuestion;
import com.guardianova.diagnosis.service.RiskQuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/riskquestion")
public class RiskQuestionController {

    private final RiskQuestionService service;

    public RiskQuestionController(RiskQuestionService service) {
        this.service = service;
    }

    @GetMapping
    public List<RiskQuestion> getAll() {
        return service.findAll();
    }

    @PostMapping
    public RiskQuestion create(@RequestBody RiskQuestion entity) {
        return service.save(entity);
    }
}
