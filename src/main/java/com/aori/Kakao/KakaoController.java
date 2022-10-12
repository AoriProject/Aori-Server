package com.aori.Kakao;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kakao")
@RequiredArgsConstructor
public class KakaoController {

    private final KakaoService kakaoService;

    @GetMapping("/login")
    public ResponseEntity<?> kakaoLogin(@RequestParam("code") String auth) {
        String token = kakaoService.getUserAuthorizationCode(auth);
        return new ResponseEntity<>(token, HttpStatus.OK);
    }
}
