package com.guardianova.legalbot.controller;

import com.guardianova.legalbot.model.LegalTemplate;
import com.guardianova.legalbot.service.LegalTemplateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/legaltemplate")
public class LegalTemplateController {

    private final LegalTemplateService service;

    public LegalTemplateController(LegalTemplateService service) {
        this.service = service;
    }

    @GetMapping
    public List<LegalTemplate> getAll() {
        return service.findAll();
    }

    @PostMapping
    public LegalTemplate create(@RequestBody LegalTemplate entity) {
        return service.save(entity);
    }
}
