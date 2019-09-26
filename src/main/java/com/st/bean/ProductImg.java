package com.st.bean;

import lombok.Data;

import java.util.Date;

//商品图片
@Data
public class ProductImg {
    private Long productImgId;//id
    private String imgAddress;//图片存放地址
    private String imgDesc;//描述
    private Integer priority;//权重
    private Date createTime;//创建时间
    private Long productId;//对应产品ID
}
