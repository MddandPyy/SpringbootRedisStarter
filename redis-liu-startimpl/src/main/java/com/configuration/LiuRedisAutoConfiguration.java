package com.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author lzp
 * @version V1.0
 * @Classname LiuRedisTemplate
 * @Date 2020/4/1 14:37
 */
@ConditionalOnClass(RedisOperations.class)
@Import(value ={LiuRedisConfig.class,LiuRedisProperties.class})
public class LiuRedisAutoConfiguration {

    @Bean
    public RedisTemplate<String,String> redisTemplate(LettuceConnectionFactory lettuceConnectionFactory){
        RedisTemplate<String,String> redisTemplate = new RedisTemplate<String,String>();
        redisTemplate.setConnectionFactory(lettuceConnectionFactory);
        return redisTemplate;
    }
}
