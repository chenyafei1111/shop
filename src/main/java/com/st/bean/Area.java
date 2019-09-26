package com.st.bean;

import lombok.Data;

import java.util.Date;

//区域实体类
@Data
public class Area {
  private Integer areaId;//id
  private String areaName;//名字
  private Integer priority;//权重
  private Date createTime; //创建时间
  private Date lastEditTime;//更新时间
}
