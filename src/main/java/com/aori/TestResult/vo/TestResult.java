package com.aori.TestResult.vo;

import com.aori.TestResult.dto.TestResultRequest;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class TestResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @NonNull int testResultId;
    private @NonNull int testOwnerId;
    private String resultMbti;
    private @NonNull String testUsername;

    public static TestResult mapper(TestResultRequest dto) {
        return TestResult.builder()
                .testResultId  (dto.getTestResultId())
                .testOwnerId   (dto.getTestOwnerId())
                .resultMbti    (dto.getResultMbti())
                .testUsername  (dto.getTestUsername())
                .build();
    }
}
