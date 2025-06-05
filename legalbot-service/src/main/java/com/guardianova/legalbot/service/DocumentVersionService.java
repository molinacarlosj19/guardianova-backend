package com.guardianova.legalbot.service;

import com.guardianova.legalbot.model.DocumentVersion;
import com.guardianova.legalbot.repository.DocumentVersionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentVersionService {

    private final DocumentVersionRepository repository;

    public DocumentVersionService(DocumentVersionRepository repository) {
        this.repository = repository;
    }

    public List<DocumentVersion> findAll() {
        return repository.findAll();
    }

    public DocumentVersion save(DocumentVersion entity) {
        return repository.save(entity);
    }
}
