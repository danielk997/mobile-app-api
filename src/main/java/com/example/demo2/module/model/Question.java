package com.example.demo2.module.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "CONTENT", nullable = false)
    private String content;

    @Column(name = "ANSWERS", nullable = false)
    private String answers;

    @Column(name = "CORRECT", nullable = false)
    private String correct;
}
