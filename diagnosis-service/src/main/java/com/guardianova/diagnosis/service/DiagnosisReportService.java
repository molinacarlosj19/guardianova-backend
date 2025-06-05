package com.guardianova.diagnosis.service;

import com.guardianova.diagnosis.model.DiagnosisReport;
import com.guardianova.diagnosis.repository.DiagnosisReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnosisReportService {

    private final DiagnosisReportRepository repository;

    public DiagnosisReportService(DiagnosisReportRepository repository) {
        this.repository = repository;
    }

    public List<DiagnosisReport> findAll() {
        return repository.findAll();
    }

    public DiagnosisReport save(DiagnosisReport entity) {
        return repository.save(entity);
    }
}
