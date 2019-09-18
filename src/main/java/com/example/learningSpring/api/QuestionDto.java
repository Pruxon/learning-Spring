package com.example.learningSpring.api;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@Builder

public class helloDto {

    private final Integer id;
    private final String message;
}
