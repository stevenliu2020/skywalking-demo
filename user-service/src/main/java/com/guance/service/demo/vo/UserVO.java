package com.guance.service.demo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liuyj
 * @since 2022/5/19 17:05
 */
@Data
public class UserVO implements Serializable {
    private Integer id;
    private Integer deptId;
    private String userName;
    private String nickName;
    private String email;
    private String phonenumber;
}
