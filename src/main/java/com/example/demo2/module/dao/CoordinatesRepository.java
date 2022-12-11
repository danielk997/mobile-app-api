package com.example.demo2.module.dao;

import com.example.demo2.module.model.Coordinates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CoordinatesRepository extends JpaRepository<Coordinates, Integer> {


    @Query("from Coordinates c join fetch c.question")
    List<Coordinates> findAllWithQuestions();
}
