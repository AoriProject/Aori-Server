package com.aori.User.vo;

import com.aori.User.dto.UserJoinDto;
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

    public static User join(UserJoinDto userJoinDto) {
        return User.builder()
                .userId    (userJoinDto.getUserId     ())
                .username  (userJoinDto.getUsername   ())
                .sex       (userJoinDto.getSex        ())
                .testLink  (userJoinDto.getTest_link  ())
                .resultLink(userJoinDto.getResult_link())
                .mbti      (userJoinDto.getMbti       ())
                .build();
    }
}
