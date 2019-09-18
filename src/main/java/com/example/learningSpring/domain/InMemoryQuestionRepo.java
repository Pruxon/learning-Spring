package com.example.learningSpring.domain;

import com.example.learningSpring.domain.Question;
import com.example.learningSpring.domain.QuestionRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Data
@Component
public class InMemoryQuestionRepo implements QuestionRepo {

    private final ConcurrentHashMap<Integer, Question> questionRepository = new ConcurrentHashMap<>(
    );


    public void insert(Question question) {
        questionRepository.put(question.getId(), question);
    }

    public Question returnQuestion(Integer id) {
        //questionRepository.put(1,new Question(1,"Co daje krowa","Mleko"));
        //return Optional.ofNullable(questionRepository.get(id)).orElseThrow(RuntimeException::new);
        return new Question(1,"Co daje krowa","Mleko");
    }

}
