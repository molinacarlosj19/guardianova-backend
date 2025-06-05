package com.guardianova.diagnosis.controller;

import com.guardianova.diagnosis.model.DiagnosisReport;
import com.guardianova.diagnosis.service.DiagnosisReportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diagnosisreport")
public class DiagnosisReportController {

    private final DiagnosisReportService service;

    public DiagnosisReportController(DiagnosisReportService service) {
        this.service = service;
    }

    @GetMapping
    public List<DiagnosisReport> getAll() {
        return service.findAll();
    }

    @PostMapping
    public DiagnosisReport create(@RequestBody DiagnosisReport entity) {
        return service.save(entity);
    }
}
