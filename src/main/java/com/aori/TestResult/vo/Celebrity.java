package com.aori.TestResult.vo;

import lombok.*;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Celebrity {
    private @NonNull int id;
    private @NonNull String name;
    private @NonNull String mbti;
    private @NonNull String image;
    private @NonNull String sex;
}
