package com.st.bean;

import lombok.Data;

import java.util.Date;

//商店
@Data
public class Shop {
    private Long shopId;//id
    private String shopName;//商店名称
    private  String shopDesc;//描述
    private String shopAddress;//地址
    private String phone;//电话
    private String shopImg;//图片
    private Integer priority;//权重
    private Date createTime;//创建时间
    private Date lastEditTime;//修改时间
    private Integer enableStatus;//状态 -1 不可用 0 审核中  1可用
    private String advice;//超级管理员给店家的提醒
    private Area area;//地区
    private PersonInfo owner;//店主
    private ShopCategory shopCategory;//商店类别
}
