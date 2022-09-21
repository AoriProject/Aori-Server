package com.aori.User.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserJoinDto {

    public Long userId;
    public String username;
    public String mbti;
    public String sex;
    public String test_link;
    public String result_link;
}
