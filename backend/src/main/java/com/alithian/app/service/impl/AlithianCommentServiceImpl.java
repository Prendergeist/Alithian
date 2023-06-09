package com.alithian.app.service.impl;


import com.alithian.app.config.SimpleIdGenerator;
import com.alithian.app.mapper.AlithianCommentMapper;
import com.alithian.app.model.AlithianComment;
import com.alithian.app.service.IAlithianCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;


@Service
public class AlithianCommentServiceImpl extends ServiceImpl<AlithianCommentMapper, AlithianComment> implements IAlithianCommentService {

    @Autowired
    private SimpleIdGenerator simpleIdGenerator;

    @Override
    public Boolean add(AlithianComment body) {
        body.setTime(Calendar.getInstance().getTime());
        body.setId(simpleIdGenerator.objectId());
        return baseMapper.insert(body) > 0;
    }
}
