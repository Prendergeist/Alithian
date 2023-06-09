package com.alithian.app.mapper;


import com.alithian.app.model.AlithianArticle;
import com.alithian.app.model.AlithianUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AlithianUserMapper extends BaseMapper<AlithianUser> {

}
