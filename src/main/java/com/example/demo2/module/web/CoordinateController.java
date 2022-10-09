package com.example.demo2.module.web;

import com.example.demo2.Utils;
import com.example.demo2.module.dto.CoordinatesDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coords")
public class CoordinateController {

    @GetMapping
    public ResponseEntity<CoordinatesDTO> index() {
        CoordinatesDTO coords = new CoordinatesDTO();
        coords.setLongitude(Math.random() * 180 * Utils.plusOrMinus());
        coords.setLatitude(Math.random() * 90 * Utils.plusOrMinus());

        return ResponseEntity.ok(coords);
    }
}
