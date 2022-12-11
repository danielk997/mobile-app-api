package com.example.demo2.module.service;

import com.example.demo2.module.dao.CoordinatesRepository;
import com.example.demo2.module.model.Coordinates;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CoordinatesService {

    private final CoordinatesRepository coordinatesRepository;

    public List<Coordinates> getAll() {
        return coordinatesRepository.findAllWithQuestions();
    }
}
