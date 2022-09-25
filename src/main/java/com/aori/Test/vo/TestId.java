package com.aori.Test.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class TestId implements Serializable {

    @Column(name = "test_group")
    private int testGroup;

    @Column(name = "question")
    private String question;
}
