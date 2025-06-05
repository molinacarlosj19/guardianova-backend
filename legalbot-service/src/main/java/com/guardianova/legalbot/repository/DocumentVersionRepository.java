package com.guardianova.legalbot.repository;

import com.guardianova.legalbot.model.DocumentVersion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentVersionRepository extends JpaRepository<DocumentVersion, Long> {}
