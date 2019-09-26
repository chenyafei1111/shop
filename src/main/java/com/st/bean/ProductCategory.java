package com.st.bean;

import lombok.Data;

import java.util.Date;

//商品实体类
@Data
public class ProductCategory {
    private Long productCateGoryId;//id
    private Long shopId;//商店id
    private String productCategoryName;//商品名称
    private Integer priority;//权重
    private Date createTime;//创建时间
}
