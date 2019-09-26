package com.st.bean;

import lombok.Data;

import java.util.Date;

//头条实体类
@Data
public class HeadLine {
    private Long lineId;//id
    private String lineName;//头条名字
    private String lineLink;//链接
    private String lineImg;//图片
    private Integer priority;//权重
    private Integer enableStatus;//状态 0 禁用 1 可用
    private Date createTime;//创建时间
    private Date lastEditTime;//修改时间
}
