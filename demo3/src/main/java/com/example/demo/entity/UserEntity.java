package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户信息
 */
@Data
@TableName("t_user")
public class UserEntity {

    @ApiModelProperty(value = "主键")
    @TableId
    private Long id;
    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    @TableField("user_name")
    private String userName;

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    // @TableField("age")
    private Integer age;


}
