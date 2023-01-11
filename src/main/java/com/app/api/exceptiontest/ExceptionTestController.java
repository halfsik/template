package com.app.api.exceptiontest;

import com.app.api.dto.BindExceptionDto;
import com.app.api.dto.TestEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/exception")
public class ExceptionTestController {

    @GetMapping("/bind-exception-test")
    public String bindExceptionTest(@Valid BindExceptionDto bindExceptionDto) { // valid조건 무시시 오류
        return "Ok";
    }

    @GetMapping("/type-exception-test")
    public String typeMismatchException(TestEnum testEnum){ // testEnum = TEST로 안보낼시 오류
        return "ok";
    }

}
