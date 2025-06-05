package com.guardianova.legalbot.service;

import com.guardianova.legalbot.model.LegalDocument;
import com.guardianova.legalbot.repository.LegalDocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegalDocumentService {

    private final LegalDocumentRepository repository;

    public LegalDocumentService(LegalDocumentRepository repository) {
        this.repository = repository;
    }

    public List<LegalDocument> findAll() {
        return repository.findAll();
    }

    public LegalDocument save(LegalDocument entity) {
        return repository.save(entity);
    }
}
