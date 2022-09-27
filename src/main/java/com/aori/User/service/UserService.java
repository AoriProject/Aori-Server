package com.aori.User.service;

import com.aori.User.dto.UserJoinRequest;
import com.aori.User.dto.UserJoinResponse;

public interface UserService {

    UserJoinResponse save(UserJoinRequest request);
}
