package com.aori.User.vo;

import com.aori.User.dto.UserJoinRequest;
import com.aori.User.dto.UserJoinResponse;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String sex;
    private String testLink;
    private String resultLink;
    private String mbti;

    public static User mapper(UserJoinRequest request) {
        return User.builder()
                .username  (request.getUsername())
                .sex       (request.getSex     ())
                .mbti      (request.getMbti    ())
                .build();
    }

    public static User linkUpdate(User user, UserJoinResponse response) {
        user.setTestLink(response.getTest_link());
        user.setResultLink(response.getResult_link());
        return user;
    }
}
