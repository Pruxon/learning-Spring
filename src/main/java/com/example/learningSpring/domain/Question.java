package com.example.learningSpring.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Question {

    private final Integer id;
    private final String question;
    private final String answer;
}
