package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author lzp
 * @version V1.0
 * @Classname RedisService
 * @Date 2020/4/1 16:55
 */
@Service
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    public void cache(){
        redisTemplate.opsForValue().set("start","success");
    }

}
