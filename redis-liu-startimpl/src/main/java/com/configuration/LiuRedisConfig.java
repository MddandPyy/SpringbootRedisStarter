package com.configuration;

import io.lettuce.core.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

/**
 * @author lzp
 * @version V1.0
 * @Classname liuRedisConfig
 * @Date 2020/4/1 13:16
 */
//对conditionnal做了扩展，当classpath路径下面，有某个类的时候，就加载这个配置
@ConditionalOnClass(RedisClient.class)
@Configuration
public class LiuRedisConfig {

    @Bean
    public LettuceConnectionFactory lettuceConnectionFactory(RedisStandaloneConfiguration configuration){
        return new LettuceConnectionFactory(configuration);
    }


    @Bean
    public RedisStandaloneConfiguration redisStandaloneConfiguration(LiuRedisProperties liuRedisProperties,RedisPassword redisPassword){
        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
        configuration.setHostName(liuRedisProperties.getHost());
        configuration.setPassword(redisPassword);
        configuration.setPort(liuRedisProperties.getPort());
        return configuration;
    }

    @Bean
    public RedisPassword redisPassword(LiuRedisProperties liuRedisProperties){
        return RedisPassword.of(liuRedisProperties.getPassword());
    }

}
