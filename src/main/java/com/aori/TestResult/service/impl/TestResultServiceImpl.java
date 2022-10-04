package com.aori.TestResult.service.impl;

import com.aori.TestResult.dto.TestResultRequest;
import com.aori.TestResult.repository.TestResultRepository;
import com.aori.TestResult.service.TestResultService;
import com.aori.TestResult.vo.TestResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestResultServiceImpl implements TestResultService {

    private final TestResultRepository testResultRepository;

    @Override
    public TestResult regist(TestResultRequest request) {
        TestResult registedTestResult = testResultRepository.save(TestResult.mapper(request));
        return registedTestResult;
    }
}
