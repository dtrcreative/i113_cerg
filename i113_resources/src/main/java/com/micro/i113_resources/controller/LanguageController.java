package com.micro.i113_resources.controller;

import com.micro.i113_resources.model.dto.LanguageDto;
import com.micro.i113_resources.service.LanguageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resource/language")
public class LanguageController {

    private final LanguageService languageService;

    public LanguageController(LanguageService service){
        this.languageService = service;
    }

    @GetMapping("/all")
    public List<LanguageDto> getAll() {
        return languageService.selectAll();
    }

    @PostMapping("/")
    public LanguageDto create(@RequestBody LanguageDto unitDto) {
        return languageService.create(unitDto);
    }

    @PutMapping("/")
    public LanguageDto update(@RequestBody LanguageDto unitDto) {
        return languageService.update(unitDto);
    }

    @DeleteMapping("/{id}")
    public void deleteUnit(@PathVariable("id") int id) {
        languageService.delete(id);
    }

    @PostMapping("/selected")
    public void deleteSelected(@RequestBody List<Integer> values) {
        languageService.deleteSelected(values);
    }

    @PostMapping("/upload-add")
    public int uploadAndAddJson(@RequestBody List<LanguageDto> unitsDtoList) {
        return languageService.createByListAndCountSuccessful(unitsDtoList);
    }

    @PostMapping("/upload-replace")
    public int uploadWithReplaceJson(@RequestBody List<LanguageDto> unitsDtoList) {
        return languageService.replaceAllByListAndCount(unitsDtoList);
    }

}
