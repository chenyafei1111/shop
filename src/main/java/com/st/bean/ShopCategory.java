package com.st.bean;

import lombok.Data;

import java.util.Date;

//店铺类别
@Data
public class ShopCategory {
    private Long shopCategoryId;//id
    private String shopCategoryName;//店铺名字
    private String shopCategoryDesc;//店铺描述
    private String shopCategoryImg;//图片
    private Integer priority;//权重
    private Date createTime;//创建时间
    private Date lastEditTime;//修改时间
    private  ShopCategory parent;//上级类别
}
