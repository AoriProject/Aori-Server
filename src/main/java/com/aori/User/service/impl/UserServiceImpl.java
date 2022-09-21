package com.aori.User.service.impl;

import com.aori.User.dto.UserJoinDto;
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
    public Long save(UserJoinDto userJoinDto) {
        User user = userRepository.save(User.join(userJoinDto));
        return user.getUserId();
    }
}
