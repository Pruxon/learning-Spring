package com.example.learningSpring.api;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@Builder

public class QuestionDto {

    private final String message;
    private final String answer;
}
