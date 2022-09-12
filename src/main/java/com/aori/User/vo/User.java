package com.aori.User.vo;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long userId;
    private String username;
    private String sex;
    private String testLink;
    private String resultLink;

    @Builder
    public User instance(Long userId, String username, String sex, String testLink, String resultLink) {
        return new UserBuilder()
                .userId(userId)
                .username(username)
                .sex(sex)
                .testLink(testLink)
                .resultLink(resultLink)
                .build();
    }
}
