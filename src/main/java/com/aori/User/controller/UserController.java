package com.aori.User.controller;

import com.aori.User.repository.UserRepository;
import com.aori.User.vo.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        User user = userRepository.findById(1L).orElse(null);
        return new ResponseEntity<>(user.getUsername(), HttpStatus.OK);
    }
}
