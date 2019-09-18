package com.example.learningSpring.domain;

import com.example.learningSpring.api.QuestionDto;

import java.util.Random;

public class QuestionFactory {

    Question create(QuestionDto questionDto) {
        return Question.builder()
                .id(generateID())
                .answer(questionDto.getAnswer())
                .question(questionDto.getMessage())
                .build();
    }

    Integer generateID() {
        return Math.abs(new Random().nextInt());
    }
}
