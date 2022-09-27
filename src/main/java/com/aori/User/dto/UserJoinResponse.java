package com.aori.User.dto;

import com.aori.User.vo.User;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserJoinResponse {

    private String test_link;
    private String result_link;

    public static UserJoinResponse mapper(User user) {
        UserJoinResponse response = new UserJoinResponse();
        response.setTest_link("/test/" + user.getUserId());
        response.setResult_link("/result/" + user.getUserId());
        return response;
    }
}
