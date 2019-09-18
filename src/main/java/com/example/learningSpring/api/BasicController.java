package com.example.learningSpring.api;

import com.example.learningSpring.domain.Question;
import com.example.learningSpring.domain.QuestionRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/questions")
@RequiredArgsConstructor
public class BasicController {

    private final QuestionRepo questionRepo;

    @GetMapping("/{id}")
    public Question getHelloWorld(@PathParam("id") Integer id) {
       return questionRepo.returnQuestion(id);
    };
}
