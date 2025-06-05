package com.guardianova.legalbot.controller;

import com.guardianova.legalbot.model.LegalDocument;
import com.guardianova.legalbot.service.LegalDocumentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/legaldocument")
public class LegalDocumentController {

    private final LegalDocumentService service;

    public LegalDocumentController(LegalDocumentService service) {
        this.service = service;
    }

    @GetMapping
    public List<LegalDocument> getAll() {
        return service.findAll();
    }

    @PostMapping
    public LegalDocument create(@RequestBody LegalDocument entity) {
        return service.save(entity);
    }
}
