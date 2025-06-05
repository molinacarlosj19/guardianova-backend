package com.guardianova.diagnosis.repository;

import com.guardianova.diagnosis.model.DiagnosisReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosisReportRepository extends JpaRepository<DiagnosisReport, Long> {}
