package com.st.bean;

import lombok.Data;

import java.util.Date;

//微信授权账号
@Data
public class WeChatAuth {
    private Long weChatAuthId;//id
    private String openId;//公众号id
    private Date createTime;//创建时间
    private PersonInfo personInfo;//关联用户信息
}
