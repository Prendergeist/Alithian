package com.alithian.app.mapper;


import com.alithian.app.model.AlithianArticle;
import com.alithian.app.model.AlithianComment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AlithianCommentMapper extends BaseMapper<AlithianComment> {

    List<AlithianComment> getListByArtId(String id);

}
