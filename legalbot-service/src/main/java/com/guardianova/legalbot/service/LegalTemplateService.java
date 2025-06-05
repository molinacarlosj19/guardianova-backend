package com.guardianova.legalbot.service;

import com.guardianova.legalbot.model.LegalTemplate;
import com.guardianova.legalbot.repository.LegalTemplateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LegalTemplateService {

    private final LegalTemplateRepository repository;

    public LegalTemplateService(LegalTemplateRepository repository) {
        this.repository = repository;
    }

    public List<LegalTemplate> findAll() {
        return repository.findAll();
    }

    public LegalTemplate save(LegalTemplate entity) {
        return repository.save(entity);
    }
}
