package com.aori.Test.service;

import com.aori.Test.dto.TestQuestionDto;

import java.util.List;

public interface TestService {
    TestQuestionDto getQuestion(int page);
}
