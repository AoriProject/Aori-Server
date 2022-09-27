package com.aori.User.service.impl;

import com.aori.User.dto.UserJoinRequest;
import com.aori.User.dto.UserJoinResponse;
import com.aori.User.repository.UserRepository;
import com.aori.User.service.UserService;
import com.aori.User.vo.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserJoinResponse save(UserJoinRequest request) {
        User user = userRepository.save(User.mapper(request));
        UserJoinResponse response = UserJoinResponse.mapper(user);
        userRepository.save(User.linkUpdate(user, response));
        return response;
    }
}
