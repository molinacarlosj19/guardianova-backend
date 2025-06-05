package com.guardianova.legalbot.repository;

import com.guardianova.legalbot.model.LegalTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegalTemplateRepository extends JpaRepository<LegalTemplate, Long> {}
