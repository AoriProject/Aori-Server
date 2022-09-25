package com.aori.Test.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestQuestionDto {
    public String question1;
    public String question2;

    public TestQuestionDto(String question1, String question2) {
        this.question1 = question1;
        this.question2 = question2;
    }
}
