package com.aori.TestResult.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestResultRequest {
    private @NonNull int testResultId;
    private @NonNull int testOwnerId;
    private String resultMbti;
    private @NonNull String testUsername;
}