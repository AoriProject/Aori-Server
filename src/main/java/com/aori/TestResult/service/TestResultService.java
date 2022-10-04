package com.aori.TestResult.service;

import com.aori.TestResult.dto.TestResultRequest;
import com.aori.TestResult.vo.TestResult;

public interface TestResultService {
    TestResult regist(TestResultRequest request);
}
