package com.example.learningSpring.infrastructure;

import com.example.learningSpring.domain.Question;
import com.example.learningSpring.domain.QuestionRepo;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

@Data
@Component
public class InMemoryQuestionRepo implements QuestionRepo {

    ConcurrentHashMap<Integer, Question> questionRepository;


    @Override
    public void insert(Question question) {
        question.getId();
        
    }
}
