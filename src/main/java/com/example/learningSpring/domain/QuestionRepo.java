package com.example.learningSpring.domain;

public interface QuestionRepo {

     void insert(Question question);

     Question returnQuestion(Integer id);
}
