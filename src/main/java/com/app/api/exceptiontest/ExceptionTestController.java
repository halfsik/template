package com.app.api.exceptiontest;

import com.app.api.dto.BindExceptionDto;
import com.app.api.dto.TestEnum;
import com.app.global.error.ErrorCode;
import com.app.global.error.exception.BusinessException;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.prefs.BackingStoreException;

@RestController
@RequestMapping("/api/exception")
public class ExceptionTestController {
//
    @GetMapping("/bind-exception-test")
    public String bindExceptionTest(@Valid BindExceptionDto bindExceptionDto) { // valid조건 무시시 오류
        return "Ok";
    }

    @GetMapping("/type-exception-test")
    public String typeMismatchException(TestEnum testEnum){ // testEnum = TEST로 안보낼시 오류
        return "ok";
    }

    @GetMapping("/business-exception-test")
    public String businessExceptionTest(String isError){ //testEnum=true -> 에러

        if("true".equals(isError)){
            throw  new BusinessException(ErrorCode.TEST);
        }
        return "ok";
    }



}
