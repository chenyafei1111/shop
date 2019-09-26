package com.st.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;

//商品
@Data
public class Porduct {
    private Long productId;//id
    private String productName;//商品名称
    private String productDesc;//描述
    private String productImg;//简略图
    private Double normalPrice;//正常价格
    private Double discountPrice;//打折价格
    private Integer priority;//权重
    private Date createTime;//创建时间
    private Date lastEditTime;//修改时间
    private Integer enableStatus;//商品状态 0下架 1 可出售
    private List<ProductImg> productImgs;//详细图片
    private ProductCategory productCategory;//商品类别
    private Shop shop;//上架的商店
}
