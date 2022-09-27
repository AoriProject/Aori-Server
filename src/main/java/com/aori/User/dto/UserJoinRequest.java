package com.aori.User.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserJoinRequest {

    public String username;
    public String sex;
    public String mbti;
}
