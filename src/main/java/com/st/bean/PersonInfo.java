package com.st.bean;

import lombok.Data;

import java.util.Date;

//用户类型实体类
@Data
public class PersonInfo {
    private Long userId;//id
    private String name;//名字
    private String profileImg;//头像
    private String email;//邮箱
    private String gender;//性别
    private Integer enableStatus;//用户状态
    private Integer userType;//用户类型 1 客户 2 店家 3超级管理员
    private Date createTime;//创建时间
    private  Date lastEditTime;//修改时间
}
