package com.alithian.app.mapper;


import com.alithian.app.model.AlithianArticle;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface AlithianArticleMapper extends BaseMapper<AlithianArticle> {

    List<Map> pagesList(AlithianArticle query);
    List<AlithianArticle> randQuery(AlithianArticle query);
}
