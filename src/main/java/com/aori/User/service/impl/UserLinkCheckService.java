package com.aori.User.service.impl;

import com.aori.User.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserLinkCheckService {
    
    private final UserRepository userRepository;
    
    public boolean isUniqueTestLink(String link) {
        Long count = userRepository.countTestLink(link);
        return count == 0;
    }
}
