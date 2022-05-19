package com.guance.service.demo.enums;

/**
 * @author liuyj
 * @since 2022/5/19 17:03
 */
public enum GlobalResultEnum {
    SUCCESS("0", "成功"),
    ERROR("1", "失败"),
    UNKNOWN("-1", "未知错误"),
    BAD_REQUEST("400", "Bad Request"),
    UNLOGIN("401", "用户未登陆"),
    AES_ENCRYPT_ERROR("1000000", "AES加密失败"),
    AES_DECRYPT_ERROR("1000001", "AES解密失败"),
    ILLEGAL_ARGUMENT_ERROR("1000002", "参数校验不通过"),

    ;

    private String code;
    private String message;

    GlobalResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
