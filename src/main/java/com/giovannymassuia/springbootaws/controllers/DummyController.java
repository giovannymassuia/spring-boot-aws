package com.giovannymassuia.springbootaws.controllers;

import com.giovannymassuia.springbootaws.dtos.DummyDto;
import com.giovannymassuia.springbootaws.services.DummyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dummy")
@RequiredArgsConstructor
public class DummyController {

    private final DummyService dummyService;

    @GetMapping
    public ResponseEntity<List<DummyDto>> findAll() {
        return ResponseEntity.ok(this.dummyService.findAll());
    }

}
