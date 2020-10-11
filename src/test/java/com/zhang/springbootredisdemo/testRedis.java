package com.zhang.springbootredisdemo;

import com.zhang.springbootredisdemo.entity.User;
import com.zhang.springbootredisdemo.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import javax.annotation.Resource;

@SpringBootTest
public class testRedis {
    @Resource
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void test1() {
        redisUtil.set("user",new User("张三",113));
        System.out.println(redisUtil.get("user") );
    }
}
