package com.guance.service.demo.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.guance.service.demo.enums.GlobalResultEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author liuyj
 * @since 2022/5/19 17:02
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class DataResult<T> implements Serializable {
    private boolean success;
    private String code;
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public static <T> DataResult<T> success() {
        return success(null, null);
    }

    public static <T> DataResult<T> success(T data) {
        return success(null, data);
    }

    public static <T> DataResult<T> success(String message, T data) {
        return new DataResult(true, GlobalResultEnum.SUCCESS.getCode(), message, data);
    }

    public static <T> DataResult<T> failure(){
        return failure(GlobalResultEnum.ERROR.getCode(), GlobalResultEnum.ERROR.getMessage(), null);
    }

    public static <T> DataResult<T> failure(String message){
        return failure(GlobalResultEnum.ERROR.getCode(), message);
    }

    public static <T> DataResult<T> failure(GlobalResultEnum errorEnum){
        return failure(errorEnum.getCode(), errorEnum.getMessage());
    }

    public static <T> DataResult<T> failure(String code, String message){
        return failure( code, message, null);
    }

    public static <T> DataResult<T> failure(String code, String message, T data){
        return new DataResult(false, code, message, data);
    }

}
