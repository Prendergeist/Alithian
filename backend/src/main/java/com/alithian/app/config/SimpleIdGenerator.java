package com.alithian.app.config;

import cn.hutool.core.lang.ObjectId;
import cn.hutool.core.lang.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.locks.ReentrantLock;


@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Slf4j
@Component
public class SimpleIdGenerator {

    private static final ReentrantLock reentrantLock = new ReentrantLock();

    public String randomUUID() {
        try {
            reentrantLock.lock();
            return UUID.randomUUID().toString();
        } finally {
            reentrantLock.unlock();
        }

    }

    public String simpleUUID() {

        try {
            reentrantLock.lock();
            return UUID.randomUUID().toString(true);
        } finally {
            reentrantLock.unlock();
        }


    }

    public String fastUUID() {

        try {
            reentrantLock.lock();
            return UUID.fastUUID().toString();
        } finally {
            reentrantLock.unlock();
        }

    }

    public String fastSimpleUUID() {

        try {
            reentrantLock.lock();

            return UUID.fastUUID().toString(true);
        } finally {
            reentrantLock.unlock();
        }

    }

    public String objectId() {

        try {
            reentrantLock.lock();

            return ObjectId.next();
        } finally {
            reentrantLock.unlock();
        }

    }
}
