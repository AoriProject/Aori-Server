package com.aori.TestResult.vo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MbtiFeature {
    private @NonNull String mbti;
    private @NonNull String feature;
    private @NonNull String modifier;
}
