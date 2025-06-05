package com.guardianova.legalbot.repository;

import com.guardianova.legalbot.model.LegalDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegalDocumentRepository extends JpaRepository<LegalDocument, Long> {}
