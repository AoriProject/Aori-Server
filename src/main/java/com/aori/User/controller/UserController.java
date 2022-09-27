package com.aori.User.controller;

import com.aori.User.dto.UserJoinRequest;
import com.aori.User.dto.UserJoinResponse;
import com.aori.User.service.UserService;
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
    public ResponseEntity<?> join(@RequestBody UserJoinRequest request) {
        UserJoinResponse response = userService.save(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
