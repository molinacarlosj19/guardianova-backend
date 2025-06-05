package com.guardianova.diagnosis.controller;

import com.guardianova.diagnosis.model.RiskAnswer;
import com.guardianova.diagnosis.service.RiskAnswerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/riskanswer")
public class RiskAnswerController {

    private final RiskAnswerService service;

    public RiskAnswerController(RiskAnswerService service) {
        this.service = service;
    }

    @GetMapping
    public List<RiskAnswer> getAll() {
        return service.findAll();
    }

    @PostMapping
    public RiskAnswer create(@RequestBody RiskAnswer entity) {
        return service.save(entity);
    }
}
