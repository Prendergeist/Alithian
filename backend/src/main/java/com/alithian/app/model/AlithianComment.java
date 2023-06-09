package com.alithian.app.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@TableName("tb_comment")
@ApiModel(value = "tb_comment", description = "tb_comment")
public class AlithianComment implements Serializable {
    @TableId
    private String id;

    private String artId;

    private String uid;

    private String context;

    private Date time;


}
