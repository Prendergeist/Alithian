package com.alithian.app.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@TableName("tb_article")
@ApiModel(value = "tb_article", description = "tb_article")
public class AlithianArticle implements Serializable {
    @TableId
    private String id;

    private String name;


    private String email;


    private String article;

    private String url;

    private String uid;

    private Date time;

    @TableField(exist = false)
    private List<AlithianComment> comments;


}
