package com.aori.Test.dto;

import com.aori.Test.vo.Test;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestQuestionDto {

    private int group;
    private ArrayList<Question> questions = new ArrayList<>();

    @Getter
    @Setter
    @AllArgsConstructor
    @Builder
    public static class Question {
        private String question;
        private int E;
        private int I;
        private int S;
        private int N;
        private int T;
        private int F;
        private int P;
        private int J;
    }

    public static TestQuestionDto mapper(List<Test> tests) {
        TestQuestionDto dto = new TestQuestionDto();

        if (tests.size() > 0) {
            dto.group = tests.get(0).getTestId().getTestGroup();

            for (Test test : tests) {
                dto.questions.add(Question.builder()
                        .question(test.getTestId().getQuestion())
                        .E(test.getE())
                        .I(test.getI())
                        .S(test.getS())
                        .N(test.getN())
                        .T(test.getT())
                        .F(test.getF())
                        .P(test.getP())
                        .J(test.getJ())
                        .build()
                );
            }
        } else {
            // 예외뱉도록 처리
        }

        return dto;
    }
}
