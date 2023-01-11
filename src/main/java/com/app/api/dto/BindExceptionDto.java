package com.app.api.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@Getter
@Slf4j
@Setter
public class BindExceptionDto {

    @NotBlank(message = "해당 값은 필수 입력값입니다.")
    private String value1;

    @Max(value = 10,message = "최대 입력값은 10 입니다")
    private Integer value2;


}
