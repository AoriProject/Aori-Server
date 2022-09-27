package com.aori.Test.service.impl;

import com.aori.Test.dto.TestQuestionDto;
import com.aori.Test.repository.TestRepository;
import com.aori.Test.service.TestService;
import com.aori.Test.vo.Test;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Override
    public TestQuestionDto getQuestion(int page) {
        List<Test> questions = testRepository.getQuestions(page);
        return TestQuestionDto.mapper(questions);
    }
}
