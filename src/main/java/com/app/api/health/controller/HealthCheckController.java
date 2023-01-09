package com.app.api.health.controller;

import com.app.api.health.dto.HealthCheckResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HealthCheckController {

    private final Environment environment;


    @GetMapping("/health")
    public ResponseEntity<HealthCheckResponseDto> healthCheck(){

        //자바에서 Array를 List으로 변환하기 위해서는 Arrays.asList(array)를 사용합니다.
        //Java 9 버전 부터는  List.of(array)라는 새로운 팩토리 메소드를 도입했습니다.

        HealthCheckResponseDto dto = HealthCheckResponseDto.builder()
                .health("ok")
                .activeProfiles(Arrays.asList(environment.getActiveProfiles()))
                .build();

        return ResponseEntity.ok(dto);

    }
}
