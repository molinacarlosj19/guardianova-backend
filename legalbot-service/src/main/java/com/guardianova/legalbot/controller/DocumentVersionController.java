package com.guardianova.legalbot.controller;

import com.guardianova.legalbot.model.DocumentVersion;
import com.guardianova.legalbot.service.DocumentVersionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documentversion")
public class DocumentVersionController {

    private final DocumentVersionService service;

    public DocumentVersionController(DocumentVersionService service) {
        this.service = service;
    }

    @GetMapping
    public List<DocumentVersion> getAll() {
        return service.findAll();
    }

    @PostMapping
    public DocumentVersion create(@RequestBody DocumentVersion entity) {
        return service.save(entity);
    }
}
