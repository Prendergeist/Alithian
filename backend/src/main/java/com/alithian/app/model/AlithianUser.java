package com.alithian.app.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@TableName("tb_user")
@ApiModel(value = "tb_user", description = "tb_user")
public class AlithianUser implements Serializable {
    @TableId
    private String id;
    private String email;
    private String password;


}
