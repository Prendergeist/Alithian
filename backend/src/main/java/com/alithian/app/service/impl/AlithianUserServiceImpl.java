package com.alithian.app.service.impl;


import com.alithian.app.config.SimpleIdGenerator;
import com.alithian.app.mapper.AlithianUserMapper;
import com.alithian.app.model.AlithianUser;
import com.alithian.app.service.IAlithianUserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlithianUserServiceImpl extends ServiceImpl<AlithianUserMapper, AlithianUser> implements IAlithianUserService {

    @Autowired
    private SimpleIdGenerator simpleIdGenerator;

    @Override
    public Boolean add(AlithianUser body) {
        body.setId(simpleIdGenerator.objectId());
        return baseMapper.insert(body) > 0;
    }

    @Override
    public AlithianUser login(AlithianUser body) {
        LambdaQueryWrapper<AlithianUser> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.select(AlithianUser::getId,AlithianUser::getEmail).eq(AlithianUser::getEmail, body.getEmail()).eq(AlithianUser::getPassword, body.getPassword());
        AlithianUser alithianUser = baseMapper.selectOne(queryWrapper);
        if (null == alithianUser) return null;
        else return alithianUser;
    }
}
