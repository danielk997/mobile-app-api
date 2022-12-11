package com.example.demo2.module.web;

import com.example.demo2.module.model.Coordinates;
import com.example.demo2.module.service.CoordinatesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/coords")
public class CoordinateController {

    private final CoordinatesService coordinatesService;

    @GetMapping
    public List<Coordinates> index() {
        return coordinatesService.getAll();
    }
}
