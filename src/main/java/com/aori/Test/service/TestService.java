package com.aori.Test.service;

import com.aori.Test.vo.Test;

import java.util.List;

public interface TestService {
    List<Test> getQuestion(int page);
}
