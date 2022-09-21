package com.aori.User.controller;

import com.aori.User.dto.UserJoinDto;
import com.aori.User.repository.UserRepository;
import com.aori.User.service.UserService;
import com.aori.User.vo.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public ResponseEntity<?> join(@RequestBody UserJoinDto userJoinDto) {
        long userId = userService.save(userJoinDto);
        return new ResponseEntity<>(userId, HttpStatus.OK);
    }
}
