package com.st.bean;

import lombok.Data;

import java.util.Date;

//本地账号
@Data
public class LocalAuth {
    private Long localAuthId;//id
    private String username;//用户名
    private String password;//密码
    private Date createTime;//创建时间
    private Date lastEditTime;//修改时间
    private PersonInfo personInfo;//用户信息
}
