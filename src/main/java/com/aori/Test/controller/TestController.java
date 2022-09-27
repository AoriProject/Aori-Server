package com.aori.Test.controller;

import com.aori.Test.dto.TestQuestionDto;
import com.aori.Test.service.TestService;
import com.aori.Test.vo.Test;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/{page}")
    public ResponseEntity<?> getQuestions(@PathVariable("page") int page) {
        TestQuestionDto question = testService.getQuestion(page);
        return new ResponseEntity<>(question, HttpStatus.OK);
    }
}
