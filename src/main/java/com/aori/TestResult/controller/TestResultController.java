package com.aori.TestResult.controller;

import com.aori.TestResult.dto.TestResultRequest;
import com.aori.TestResult.service.TestResultService;
import com.aori.TestResult.vo.TestResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testResult")
@RequiredArgsConstructor
public class TestResultController {

    private final TestResultService testResultService;

    @PostMapping("/regist")
    public ResponseEntity<?> registTestResult(@RequestBody TestResultRequest request) {
        TestResult registedTestResult = testResultService.regist(request);
        return new ResponseEntity<>(registedTestResult, HttpStatus.OK);
    }
}
