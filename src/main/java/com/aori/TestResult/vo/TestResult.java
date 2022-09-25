package com.aori.TestResult.vo;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TestResult {
    private @NonNull int resurtId;
    private @NonNull int ownerId;
    private String mbti;
    private @NonNull String userName;
}
